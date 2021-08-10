package mx.com.challenge.Bankaya.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Habilidades {
	
	private boolean is_hidden;	
	private int slot;	
	@JsonProperty("ability")	
	private Habilidad ability;

	public boolean isIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public Habilidad getAbility() {
		return ability;
	}

	public void setAbility(Habilidad ability) {
		this.ability = ability;
	}

}
