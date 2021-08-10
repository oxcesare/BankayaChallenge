package mx.com.challenge.Bankaya.Bean;

import java.util.List;

public class Peliculas {
	
	
	private Pelicula move;
	private List<VersionGrupoDetalles> version_group_details;
	
	public Pelicula getMove() {
		return move;
	}
	public void setMove(Pelicula move) {
		this.move = move;
	}
	public List<VersionGrupoDetalles> getVersion_group_details() {
		return version_group_details;
	}
	public void setVersion_group_details(List<VersionGrupoDetalles> version_group_details) {
		this.version_group_details = version_group_details;
	}
	

}
