package mx.com.challenge.Bankaya.ServiceImpl;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mx.com.challenge.Bankaya.Bean.Pokemon;
import mx.com.challenge.Bankaya.Entity.RequestSaveEntity;
import mx.com.challenge.Bankaya.Service.RequestEntityService;
import mx.com.challenge.Bankaya.Utils.Utilerias;

@Service
public class RequestEntityServiceImpl implements RequestEntityService {

	private static final Logger logger = LoggerFactory.getLogger(RequestEntityServiceImpl.class);
	
	
	@Autowired
	private RequestSaveServiceImpl requestSaveServiceImpl;
	

	RestTemplate restTemplate   = null;
	RestTemplateBuilder builder = null;

	public RequestEntityServiceImpl() {
		restTemplate = new RestTemplate();
		builder = new RestTemplateBuilder();
	}

	@Override
	public Pokemon consultaPokemon(String name,String metodo) {

		Pokemon pokemon = new Pokemon();

		RestTemplate template = builder.build();
		HttpHeaders headers = new HttpHeaders();
		headers.set("User-Agent", "poke api");
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		try {
			
			ResponseEntity<Pokemon> moveResponse = template.exchange(Utilerias.URLAPIPOKEMON + name,
					HttpMethod.GET, entity, Pokemon.class);

			logger.info("Pokemon Encontrado" + moveResponse.getBody().toString());
			
			/** save the request  **/			
			saveRequest(metodo);
			
			pokemon = moveResponse.getBody();
			

		} catch (Exception ex) {
			logger.info(ex.getMessage());
		}
		return pokemon;
	}

	private void saveRequest(String metodo) throws SocketException, UnknownHostException {
		
		try {
			
			RequestSaveEntity requestSaveEntity = new RequestSaveEntity();
			requestSaveEntity.setIpOrigen(Utilerias.getIp());
			requestSaveEntity.setMetodo(metodo);
			requestSaveEntity.setFechaPeticion(Utilerias.formatFechaRequest());
			requestSaveServiceImpl.saveRequest(requestSaveEntity);
			
		} catch (Exception ex) {
			logger.info(ex.getMessage());
		}
		
	}

}
