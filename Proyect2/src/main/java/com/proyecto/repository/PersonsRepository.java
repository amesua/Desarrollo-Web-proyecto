package com.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.proyecto.entities.Persons;

@Component
public interface PersonsRepository extends JpaRepository<Persons, Integer>{
	
	Persons findByUsername(String userName);
	public List<Persons> findByRol(Long rol);
}
