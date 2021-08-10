package mx.com.challenge.Bankaya.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIV {

	@JsonProperty("diamond-pearl")
	private DiamondPearl diamondPearl;

	@JsonProperty("heartgold-soulsilver")
	private HeartgoldSoulsilver heartgoldSoulsilver;

	private Platinum platinum;

	public DiamondPearl getDiamondPearl() {
		return diamondPearl;
	}

	public void setDiamondPearl(DiamondPearl diamondPearl) {
		this.diamondPearl = diamondPearl;
	}

	public HeartgoldSoulsilver getHeartgoldSoulsilver() {
		return heartgoldSoulsilver;
	}

	public void setHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver) {
		this.heartgoldSoulsilver = heartgoldSoulsilver;
	}

	public Platinum getPlatinum() {
		return platinum;
	}

	public void setPlatinum(Platinum platinum) {
		this.platinum = platinum;
	}

}
