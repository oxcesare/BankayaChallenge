package mx.com.challenge.Bankaya.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationVII {
	
	
	private Icons icons;
	
	@JsonProperty("ultra-sun-ultra-moon")
    private UltraSunUltraMoon ultraSunUltraMoon;

	public Icons getIcons() {
		return icons;
	}

	public void setIcons(Icons icons) {
		this.icons = icons;
	}

	public UltraSunUltraMoon getUltraSunUltraMoon() {
		return ultraSunUltraMoon;
	}

	public void setUltraSunUltraMoon(UltraSunUltraMoon ultraSunUltraMoon) {
		this.ultraSunUltraMoon = ultraSunUltraMoon;
	}
	
	
	
	

}
