package com.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.entities.Courses;


public interface CoursesRepository extends JpaRepository<Courses, Integer>{
	
	@Query(value="SELECT * FROM courses c WHERE c.nombre_curso LIKE %?1% ;", nativeQuery = true) 
	public List<Courses> CoursesByCriteria(@Param("criteria") String criteria);
	
 
}
