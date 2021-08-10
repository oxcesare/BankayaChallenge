package mx.com.challenge.Bankaya.Utils;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.com.challenge.Bankaya.ServiceImpl.RequestEntityServiceImpl;

public class Utilerias {
	
	private static final Logger logger = LoggerFactory.getLogger(Utilerias.class);

	public static final String NAMESPACE_URI = "http://www.challenge.com/Bankaya/Bean";

	public static final String POKEMONNOENCONTRADO = "Pokemon No Encontrado";

	public static final String URLAPIPOKEMON = "https://pokeapi.co/api/v2/pokemon/";

	public final static String FECHATIMESTAMP = "yyyyMMddHHmmssSSS";
	
	
	public static final String METHODABILITIES = "PokemontAbilitiesRequest";
	
	public static final String METHODEXPERIENCIE = "PokemonBaseExperienceRequest";
	
	public static final String METHODHELDITEMS = "PokemonHeldItemsRequest";
	
	public static final String METHODID = "PokemonIdRequest";
	
	public static final String METHODNAME = "PokemonNameRequest";
	
	public static final String METHOLOCATION = "PokemonLocationAreaEncountersRequest";
	
	

	public static String formatFechaRequest() {
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	}

	public static String getIp() throws SocketException, UnknownHostException {
		InetAddress ip = null;
		String hostname = "";
		try {
			ip = InetAddress.getLocalHost();
			hostname = ip.getHostName();
			
			logger.info("ip"+""+ip);
			logger.info("hostname"+""+hostname);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		return ip.toString();
	}

}
