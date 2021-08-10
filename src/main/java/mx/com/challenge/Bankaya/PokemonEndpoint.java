package mx.com.challenge.Bankaya;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.com.challenge.Bankaya.Bean.Habilidades;
import mx.com.challenge.Bankaya.Bean.Pokemon;
import mx.com.challenge.Bankaya.Bean.PokemonBaseExperienceRequest;
import mx.com.challenge.Bankaya.Bean.PokemonBaseExperienceResponse;
import mx.com.challenge.Bankaya.Bean.PokemonHeldItemsRequest;
import mx.com.challenge.Bankaya.Bean.PokemonHeldItemsResponse;
import mx.com.challenge.Bankaya.Bean.PokemonIdRequest;
import mx.com.challenge.Bankaya.Bean.PokemonIdResponse;
import mx.com.challenge.Bankaya.Bean.PokemonLocationAreaEncountersRequest;
import mx.com.challenge.Bankaya.Bean.PokemonLocationAreaEncountersResponse;
import mx.com.challenge.Bankaya.Bean.PokemonNameRequest;
import mx.com.challenge.Bankaya.Bean.PokemonNameResponse;
import mx.com.challenge.Bankaya.Bean.PokemontAbilitiesRequest;
import mx.com.challenge.Bankaya.Bean.PokemontAbilitiesResponse;
import mx.com.challenge.Bankaya.ServiceImpl.RequestEntityServiceImpl;
import mx.com.challenge.Bankaya.Utils.Utilerias;

@Endpoint
public class PokemonEndpoint {

	private static final Logger logger = LoggerFactory.getLogger(RequestEntityServiceImpl.class);

	@Autowired
	private RequestEntityServiceImpl requestEntityServiceImpl;

	@PayloadRoot(namespace = Utilerias.NAMESPACE_URI, localPart = "PokemontAbilitiesRequest")
	@ResponsePayload
	public PokemontAbilitiesResponse getAbilities(@RequestPayload PokemontAbilitiesRequest request) {

		PokemontAbilitiesResponse response = new PokemontAbilitiesResponse();

		Pokemon pokemon = new Pokemon();

		try {
			pokemon = requestEntityServiceImpl.consultaPokemon(request.getName(),Utilerias.METHODABILITIES);

			Optional<List<Habilidades>> isnull = Optional.of(pokemon.getAbilities());

			if (isnull.isPresent()) {
				response.setHabilidades(pokemon.getAbilities());				
			} else {				
				response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);
				
			}
		} catch (Exception ex) {
			response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);
			logger.info(ex.getMessage());
		}

		return response;
	}

	@PayloadRoot(namespace = Utilerias.NAMESPACE_URI, localPart = "PokemonBaseExperienceRequest")
	@ResponsePayload
	public PokemonBaseExperienceResponse getExperience(@RequestPayload PokemonBaseExperienceRequest request) {

		PokemonBaseExperienceResponse response = new PokemonBaseExperienceResponse();
		Pokemon                       pokemon  = new Pokemon();

		try {
			pokemon = requestEntityServiceImpl.consultaPokemon(request.getName(),Utilerias.METHODEXPERIENCIE);
			Optional<Integer> isnull = Optional.of(pokemon.getBase_experience());

			if (isnull.isPresent()) {
				response.setBaseExperience(pokemon.getBase_experience());				
			} else {				
				response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);
			}

		} catch (Exception ex) {
			response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);
			logger.info(ex.getMessage());
		}

		return response;
	}

	@PayloadRoot(namespace = Utilerias.NAMESPACE_URI, localPart = "PokemonHeldItemsRequest")
	@ResponsePayload
	public PokemonHeldItemsResponse getHeldItem(@RequestPayload PokemonHeldItemsRequest request) {

		PokemonHeldItemsResponse response = new PokemonHeldItemsResponse();

		Pokemon pokemon = new Pokemon();
		
		try {
			pokemon = requestEntityServiceImpl.consultaPokemon(request.getName(),Utilerias.METHODHELDITEMS);
			
			if(pokemon.getName()==null) {
				response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);
			}else {
				response.setHeld_items(pokemon.getHeld_items());	
			}	
		} catch (Exception ex) {
			response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);
			logger.info(ex.getMessage());
		}

		return response;
	}

	@PayloadRoot(namespace = Utilerias.NAMESPACE_URI, localPart = "PokemonIdRequest")
	@ResponsePayload
	public PokemonIdResponse getId(@RequestPayload PokemonIdRequest request) {

		PokemonIdResponse response = new PokemonIdResponse();

		Pokemon pokemon = new Pokemon();

		try {
			pokemon = requestEntityServiceImpl.consultaPokemon(request.getName(),Utilerias.METHODID);
		  	
			if(pokemon.getId()>0) {
				response.setId(pokemon.getId());
			}else {
				response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);				
			}
			
		} catch (Exception ex) {
			response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);	
			logger.info(ex.getMessage());
		}
		
		return response;
	}

	@PayloadRoot(namespace = Utilerias.NAMESPACE_URI, localPart = "PokemonNameRequest")
	@ResponsePayload
	public PokemonNameResponse getName(@RequestPayload PokemonNameRequest request) {

		PokemonNameResponse response = new PokemonNameResponse();

		Pokemon pokemon = new Pokemon();

		try {
			pokemon = requestEntityServiceImpl.consultaPokemon(request.getName(),Utilerias.METHODNAME);
			if(pokemon.getName()==null) {
				response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);	
			}else {
				response.setName(pokemon.getName());
			}
		} catch (Exception ex) {
			logger.info(ex.getMessage());
		}
		
		return response;
	}

	@PayloadRoot(namespace = Utilerias.NAMESPACE_URI, localPart = "PokemonLocationAreaEncountersRequest")
	@ResponsePayload
	public PokemonLocationAreaEncountersResponse getLocationArea(
			@RequestPayload PokemonLocationAreaEncountersRequest request) {

		PokemonLocationAreaEncountersResponse response = new PokemonLocationAreaEncountersResponse();

		Pokemon pokemon = new Pokemon();

		try {
			pokemon = requestEntityServiceImpl.consultaPokemon(request.getName(),Utilerias.METHOLOCATION);
			if(pokemon.getLocation_area_encounters()==null) {
				response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);	
			}else {
				response.setLocation_area_encounters(pokemon.getLocation_area_encounters());
			}
		} catch (Exception ex) {
			response.setNoEncontrado(Utilerias.POKEMONNOENCONTRADO);	
			logger.info(ex.getMessage());
		}		

		return response;
	}

}
