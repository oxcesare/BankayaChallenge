package mx.com.challenge.Bankaya.Bean;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "habilidades","noEncontrado"
})
@XmlRootElement(name = "PokemontAbilitiesResponse")
public class PokemontAbilitiesResponse {

    @XmlElement(name = "Habilidades")
    private List<Habilidades> habilidades;

    @XmlElement(name="noEncontrado")
    private String noEncontrado;
    
    public void setHabilidades(List<Habilidades> habilidades) {
		this.habilidades = habilidades;
	}
    
    public List<Habilidades> getHabilidades() {
    	if(habilidades==null) {
    		new ArrayList<Habilidades>();
    	}
		return habilidades;
	}
    
    public String getNoEncontrado() {
		return noEncontrado;
	}
    
    public void setNoEncontrado(String noEncontrado) {
		this.noEncontrado = noEncontrado;
	}
	
	
	
}
