package mx.com.challenge.Bankaya.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExamenController {

	private static final Logger logger = LoggerFactory.getLogger(ExamenController.class);

	RestTemplate restTemplate = null;

	public ExamenController() {
		restTemplate = new RestTemplate();
	}

	@GetMapping("/info")
	public String hello() {
		return "Examen Bankaya -  07 Agosto 2021" + " " + "Autor: César Ricardo Alducin Ruiz";
	}

	

}
