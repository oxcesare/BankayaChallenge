package mx.com.challenge.Bankaya.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationI {
	
	@JsonProperty("red-blue")	
	private RedBlue redBlue;
	
	private Yellow yellow;

	public RedBlue getRedBlue() {
		return redBlue;
	}

	public void setRedBlue(RedBlue redBlue) {
		this.redBlue = redBlue;
	}

	public Yellow getYellow() {
		return yellow;
	}

	public void setYellow(Yellow yellow) {
		this.yellow = yellow;
	}
	
	
	
	
	
	
	

}
