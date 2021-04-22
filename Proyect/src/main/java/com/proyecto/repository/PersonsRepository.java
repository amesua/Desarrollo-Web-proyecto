package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entities.Persons;


public interface PersonsRepository extends JpaRepository<Persons, Integer>{

}
