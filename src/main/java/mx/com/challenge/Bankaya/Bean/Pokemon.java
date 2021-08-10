package mx.com.challenge.Bankaya.Bean;

import java.util.List;

public class Pokemon {

	private List<Habilidades> abilities;
	private Integer base_experience;
	private List<Formas> forms;
	private List<IndicesJuego> game_indices;
	private Integer height;
	private List<HeldItems> held_items;
	private Integer id;
	private boolean is_default;
	private String location_area_encounters;
	private List<Peliculas> moves;
	private String name;
	private Integer order;
	private List<String> past_types;
	private Especie species;
	private Sprites sprites;
	private List<Stats> stats;
	private List<Types> types;
	private Integer weight;

	public List<Types> getTypes() {
		return types;
	}

	public void setTypes(List<Types> types) {
		this.types = types;
	}

	public List<Habilidades> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Habilidades> abilities) {
		this.abilities = abilities;
	}

	public Integer getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}

	public List<Formas> getForms() {
		return forms;
	}

	public void setForms(List<Formas> forms) {
		this.forms = forms;
	}

	public List<IndicesJuego> getGame_indices() {
		return game_indices;
	}

	public void setGame_indices(List<IndicesJuego> game_indices) {
		this.game_indices = game_indices;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public List<HeldItems> getHeld_items() {
		return held_items;
	}
	
	public void setHeld_items(List<HeldItems> held_items) {
		this.held_items = held_items;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isIs_default() {
		return is_default;
	}

	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}

	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}

	public List<Peliculas> getMoves() {
		return moves;
	}

	public void setMoves(List<Peliculas> moves) {
		this.moves = moves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public List<String> getPast_types() {
		return past_types;
	}

	public void setPast_types(List<String> past_types) {
		this.past_types = past_types;
	}

	public Especie getSpecies() {
		return species;
	}

	public void setSpecies(Especie species) {
		this.species = species;
	}

	public Sprites getSprites() {
		return sprites;
	}

	public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}

	public void setStats(List<Stats> stats) {
		this.stats = stats;
	}

	public List<Stats> getStats() {
		return stats;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
