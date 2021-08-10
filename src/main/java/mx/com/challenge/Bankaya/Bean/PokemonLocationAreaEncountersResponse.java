package mx.com.challenge.Bankaya.Bean;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location_area_encounters","noEncontrado"
})
@XmlRootElement(name = "PokemonLocationAreaEncountersResponse")
public class PokemonLocationAreaEncountersResponse {
	
	
	@XmlElement(name = "location_area_encounters")
	private String location_area_encounters;
	
	@XmlElement(name="noEncontrado")
    private String noEncontrado;
    
	
	public String getNoEncontrado() {
		return noEncontrado;
	}
	
	public void setNoEncontrado(String noEncontrado) {
		this.noEncontrado = noEncontrado;
	}
	
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	
	
	
	

}
