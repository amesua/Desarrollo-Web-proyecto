package com.proyecto.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="rol")

public class Rol {
	
	//Primary Key
	@Id
	//auto
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Tipo_rol")
	private String tipo_rol;

	public Rol(Long id, String tipo_rol) {
		super();
		this.id = id;
		this.tipo_rol = tipo_rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo_rol() {
		return tipo_rol;
	}

	public void setTipo_rol(String tipo_rol) {
		this.tipo_rol = tipo_rol;
	}
	
	

}
