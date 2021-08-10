package mx.com.challenge.Bankaya.Bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "held_items","noEncontrado"
})
@XmlRootElement(name = "PokemonHeldItemsResponse")

public class PokemonHeldItemsResponse {
	
	
	@XmlElement(name = "HeldItems")
	private List<HeldItems> held_items;
	
	@XmlElement(name="noEncontrado")
    private String noEncontrado;
    
	
	public String getNoEncontrado() {
		return noEncontrado;
	}
	
	public void setNoEncontrado(String noEncontrado) {
		this.noEncontrado = noEncontrado;
	}
	
	public List<HeldItems> getHeld_items() {
		return held_items;
	}
	
	public void setHeld_items(List<HeldItems> held_items) {
		this.held_items = held_items;
	}

}
