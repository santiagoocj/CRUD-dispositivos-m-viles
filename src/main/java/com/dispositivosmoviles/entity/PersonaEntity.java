package com.dispositivosmoviles.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "persona")
public class PersonaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long identificacion;
	
	private String nombre;
	
	private String celular;
	
	@OneToMany
	@JoinColumn(name = "vehiculo")
	private List<VehiculoEntity> vehiculos;

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public List<VehiculoEntity> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<VehiculoEntity> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	
	

}
