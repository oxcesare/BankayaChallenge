package mx.com.challenge.Bankaya.Bean;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name" })

@XmlRootElement(namespace = "http://www.challenge.com/Bankaya/Bean", name = "PokemonIdRequest")
public class PokemonIdRequest {
	
	
	@XmlElement(namespace = "http://www.challenge.com/Bankaya/Bean",required = true)
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
