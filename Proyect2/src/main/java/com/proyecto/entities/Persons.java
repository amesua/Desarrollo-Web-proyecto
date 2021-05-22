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
@Table(name="persons")

public class Persons {
	
	//Primary Key
		@Id
		//Auto_increment
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name="Nombre")
		private String nombre;
		
		@Column(name="Apellido")
		private String apellido;
		
		@Column(name="Email")
		private String email;

		@Column(name="Telefono")
		private String telefono;
		

		@Column(name="Genero")
		private String genero;
		
		@Column(name="Codigo")
		private String codigo; 
		
		@Column(name="Facultad")
		private String facultad; 
		
		@Column(name="Carrera")
		private String carrera; 
		
		@Column(name="Tipo_de_carrera")
		private String Tipodecarrera; 
		
		@Column (name="Rol")
		private Long rol;
		
		@Column (name="Username")
		private String username;
		
		@Column (name="Password")
		private String password;
		
		public Persons() {
			
		}

		public Persons(int id, String nombre, String apellido, String telefono, String genero, String codigo,
				String facultad, String carrera, String tipodecarrera, Long rol, String username, String password,
				String email) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.telefono = telefono;
			this.genero = genero;
			this.codigo = codigo;
			this.facultad = facultad;
			this.carrera = carrera;
			this.Tipodecarrera = tipodecarrera;
			this.rol = rol;
		}
		

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getFacultad() {
			return facultad;
		}

		public void setFacultad(String facultad) {
			this.facultad = facultad;
		}

		public String getCarrera() {
			return carrera;
		}

		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}

		public String getTipodecarrera() {
			return Tipodecarrera;
		}

		public void setTipodecarrera(String tipodecarrera) {
			Tipodecarrera = tipodecarrera;
		}

		public Long getRol() {
			return rol;
		}

		public void setRol(Long rol) {
			this.rol = rol;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
