package mx.com.challenge.Bankaya.Bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id","noEncontrado"
})
@XmlRootElement(name = "PokemonIdResponse")

public class PokemonIdResponse {

	
	@XmlElement(name = "id")
    private Integer id;
	
	@XmlElement(name="noEncontrado")
    private String noEncontrado;
    
	
	public String getNoEncontrado() {
		return noEncontrado;
	}
	
	public void setNoEncontrado(String noEncontrado) {
		this.noEncontrado = noEncontrado;
	}
     
     public Integer getId() {
		return id;
	}
     public void setId(Integer id) {
		this.id = id;
	}
}
