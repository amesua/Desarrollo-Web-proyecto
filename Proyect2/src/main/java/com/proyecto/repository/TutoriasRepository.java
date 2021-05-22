package com.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.proyecto.entities.Tutorias;


public interface TutoriasRepository extends JpaRepository<Tutorias, Integer>{

	@Query(value="SELECT * FROM Tutorias t WHERE t.id_curso = ?1", nativeQuery = true) 
	public List<Tutorias> TutoryByCourse(Long criteria);
}
