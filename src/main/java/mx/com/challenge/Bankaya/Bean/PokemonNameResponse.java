package mx.com.challenge.Bankaya.Bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name","noEncontrado"
})
@XmlRootElement(name = "PokemonNameResponse")
public class PokemonNameResponse {

	
	@XmlElement(name = "name")
	private String name;
	
	@XmlElement(name="noEncontrado")
    private String noEncontrado;
    
	
	public String getNoEncontrado() {
		return noEncontrado;
	}
	
	public void setNoEncontrado(String noEncontrado) {
		this.noEncontrado = noEncontrado;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
