package mx.com.challenge.Bankaya.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIII {
	
	private Emerald emerald;
	
	@JsonProperty("firered-leafgreen")	
	private FireredLeafgreen fireredLeafgreen;
	
	@JsonProperty("ruby-sapphire")
	private RubySapphire rubySapphire;

	public Emerald getEmerald() {
		return emerald;
	}

	public void setEmerald(Emerald emerald) {
		this.emerald = emerald;
	}

	public FireredLeafgreen getFireredLeafgreen() {
		return fireredLeafgreen;
	}

	public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
		this.fireredLeafgreen = fireredLeafgreen;
	}

	public RubySapphire getRubySapphire() {
		return rubySapphire;
	}

	public void setRubySapphire(RubySapphire rubySapphire) {
		this.rubySapphire = rubySapphire;
	}
	
	
	
	
	

}
