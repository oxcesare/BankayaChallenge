package mx.com.challenge.Bankaya.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationV {

	@JsonProperty("black-white")
	private BlackWhite blackWhite;

	public BlackWhite getBlackWhite() {
		return blackWhite;
	}

	public void setBlackWhite(BlackWhite blackWhite) {
		this.blackWhite = blackWhite;
	}

}
