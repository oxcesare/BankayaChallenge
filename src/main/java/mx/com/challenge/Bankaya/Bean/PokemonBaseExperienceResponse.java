package mx.com.challenge.Bankaya.Bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "baseExperience","noEncontrado" })


@XmlRootElement(name = "PokemonBaseExperienceResponse")
public class PokemonBaseExperienceResponse {

	@XmlElement(name = "baseExperience")
	private Integer baseExperience;

	
	@XmlElement(name="noEncontrado")
    protected String noEncontrado;
    
	
	public String getNoEncontrado() {
		return noEncontrado;
	}
	
	public void setNoEncontrado(String noEncontrado) {
		this.noEncontrado = noEncontrado;
	}
	
	
	public Integer getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(Integer baseExperience) {
		this.baseExperience = baseExperience;
	}

}
