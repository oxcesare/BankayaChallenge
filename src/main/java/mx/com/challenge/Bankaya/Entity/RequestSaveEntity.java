package mx.com.challenge.Bankaya.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "REQUEST")
public class RequestSaveEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSave;
	private String ipOrigen;
	private String   fechaPeticion;
	private String metodo;
	
	public RequestSaveEntity() {
		
	}
	
	public Integer getIdSave() {
		return idSave;
	}
	public void setIdSave(Integer idSave) {
		this.idSave = idSave;
	}
	public String getIpOrigen() {
		return ipOrigen;
	}
	public void setIpOrigen(String ipOrigen) {
		this.ipOrigen = ipOrigen;
	}
	
	public String getFechaPeticion() {
		return fechaPeticion;
	}
	
	public void setFechaPeticion(String fechaPeticion) {
		this.fechaPeticion = fechaPeticion;
	}
	
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaPeticion == null) ? 0 : fechaPeticion.hashCode());
		result = prime * result + ((ipOrigen == null) ? 0 : ipOrigen.hashCode());
		result = prime * result + ((metodo == null) ? 0 : metodo.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestSaveEntity other = (RequestSaveEntity) obj;
		if (fechaPeticion == null) {
			if (other.fechaPeticion != null)
				return false;
		} else if (!fechaPeticion.equals(other.fechaPeticion))
			return false;
		if (ipOrigen == null) {
			if (other.ipOrigen != null)
				return false;
		} else if (!ipOrigen.equals(other.ipOrigen))
			return false;
		if (metodo == null) {
			if (other.metodo != null)
				return false;
		} else if (!metodo.equals(other.metodo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "RequestSaveEntity [idSave=" + idSave + ", ipOrigen=" + ipOrigen + ", fechaPeticion=" + fechaPeticion
				+ ", metodo=" + metodo + "]";
	}
	
	
	
	
	
	


}
