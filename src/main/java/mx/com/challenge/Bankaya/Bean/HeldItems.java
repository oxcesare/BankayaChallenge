package mx.com.challenge.Bankaya.Bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "item","version_details"
})
@XmlRootElement(name = "HeldItems")
public class HeldItems {
	
	
	@XmlElement(name = "item")
	private Item item;
	@XmlElement(name = "VersionDetails")
	private List<VersionDetails> version_details;
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public List<VersionDetails> getVersion_details() {
		return version_details;
	}
	public void setVersion_details(List<VersionDetails> version_details) {
		this.version_details = version_details;
	}
	
	
	

}
