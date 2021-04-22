package com.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.entities.Courses;
import com.proyecto.entities.Persons;
import com.proyecto.repository.CoursesRepository;

@RestController
@RequestMapping("/Courses")

public class CoursesController {
	
	@Autowired
	private CoursesRepository coursesRepository;

	@PostMapping("/Create")
	public ResponseEntity<?> create(@RequestBody Courses courses){
		System.out.println(courses.getFacultad_curso()+courses.getNombre_curso()+courses.getId());
		return ResponseEntity.ok(coursesRepository.save(courses));
	}
	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable int id){
		Optional<Courses> coursesdel = coursesRepository.findById(id);
		if(coursesdel.isPresent()) {
			coursesRepository.deleteById(id);
			return ResponseEntity.ok(coursesdel.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/AllPersons")
	public List<Courses> allPersons(){
		return coursesRepository.findAll();
	}
	
	

}
