package mx.com.challenge.Bankaya.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationVI {
	
	

    @JsonProperty("omegaruby-alphasapphire")
	private OmegarubyAlphasapphire omegarubyalphasapphire;
	
    @JsonProperty("x-y")
    private XY xy;

	public OmegarubyAlphasapphire getOmegarubyalphasapphire() {
		return omegarubyalphasapphire;
	}

	public void setOmegarubyalphasapphire(OmegarubyAlphasapphire omegarubyalphasapphire) {
		this.omegarubyalphasapphire = omegarubyalphasapphire;
	}

	public XY getXy() {
		return xy;
	}

	public void setXy(XY xy) {
		this.xy = xy;
	}
    
    
    
	
	

}
