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
@Table(name="PersonsPerCourses")

public class PersonsPerCourses {

	//Primary Key
	@Id
	//auto
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_Course")
	private String id_course; 
	
	@Column(name="id_Person")
	private String id_Person;

	public PersonsPerCourses(Long id, String id_course, String id_Person) {
		super();
		this.id = id;
		this.id_course = id_course;
		this.id_Person = id_Person;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_course() {
		return id_course;
	}

	public void setId_course(String id_course) {
		this.id_course = id_course;
	}

	public String getId_Person() {
		return id_Person;
	}

	public void setId_Person(String id_Person) {
		this.id_Person = id_Person;
	}
	
	

}
