package com.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.entities.Courses;

import com.proyecto.repository.CoursesRepository;

@CrossOrigin()
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
	public ResponseEntity<?> deleteCourse(@PathVariable int id){
		Optional<Courses> coursesdel = coursesRepository.findById(id);
		if(coursesdel.isPresent()) {
			coursesRepository.deleteById(id);
			return ResponseEntity.ok(coursesdel.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/AllCourses")
	public List<Courses> allCourses(){
		return coursesRepository.findAll();
	}
	
	@PutMapping("/Actulizar")
	public Courses putCourses(@PathVariable int id, @RequestBody Courses newCourse){
		Courses coursesn = coursesRepository.findById(id).get();	
		
		coursesn.setFacultad_curso(newCourse.getFacultad_curso());
		coursesn.setNombre_curso(newCourse.getNombre_curso());
		
		coursesRepository.save(coursesn);
		return coursesn;
		}
	
	
	@GetMapping("/FindCourses/{criteria}")
	public ResponseEntity<?> findCourses(@PathVariable String criteria){
		System.out.println(criteria);
		return ResponseEntity.ok(this.coursesRepository.CoursesByCriteria(criteria));
	}
	
	

}
