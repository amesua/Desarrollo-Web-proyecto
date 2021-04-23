package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entities.Rol;


public interface RolRepository extends JpaRepository<Rol, Integer>{

}