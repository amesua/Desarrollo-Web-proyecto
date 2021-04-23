package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entities.Tutorias;


public interface TutoriasRepository extends JpaRepository<Tutorias, Integer>{

}
