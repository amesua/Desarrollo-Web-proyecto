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
@Table(name="Tutorias")

public class Tutorias {
	
	//Primary Key
	@Id
	//auto
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Modalidad")
	private String modalidad; 
	
	@Column(name="id_Estudiante")
	private String id_estudiante;
	
	@Column(name="id_Tutor")
	private String id_tutor;
	
	@Column(name="Fecha_inicio")
	private String fecha_inicio;
	
	@Column(name="Fecha_final")
	private String fecha_final; 
	
	@Column(name="id_Curso")
	private String id_curso;

	public Tutorias(Long id, String modalidad, String id_estudiante, String id_tutor, String fecha_inicio,
			String fecha_final, String id_curso) {
		super();
		this.id = id;
		this.modalidad = modalidad;
		this.id_estudiante = id_estudiante;
		this.id_tutor = id_tutor;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
		this.id_curso = id_curso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(String id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public String getId_tutor() {
		return id_tutor;
	}

	public void setId_tutor(String id_tutor) {
		this.id_tutor = id_tutor;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(String fecha_final) {
		this.fecha_final = fecha_final;
	}

	public String getId_curso() {
		return id_curso;
	}

	public void setId_curso(String id_curso) {
		this.id_curso = id_curso;
	} 
	
	

}
