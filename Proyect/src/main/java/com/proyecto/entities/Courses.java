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
@Table(name="courses")

public class Courses {
	
	//Primary Key
	@Id
	//auto
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Nombre_curso")
	private String nombre_curso;
	
	@Column(name="Facultad")
	private String facultad_curso;

	public Courses(Long id, String nombre_curso, String id_curso, String facultad_curso) {
		super();
		this.id = id;
		this.nombre_curso = nombre_curso;
		this.facultad_curso = facultad_curso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_curso() {
		return nombre_curso;
	}

	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}

	public String getFacultad_curso() {
		return facultad_curso;
	}

	public void setFacultad_curso(String facultad_curso) {
		this.facultad_curso = facultad_curso;
	}
	
	

}
