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

import com.proyecto.entities.Tutorias;
import com.proyecto.repository.TutoriasRepository;

@CrossOrigin()
@RestController
@RequestMapping("/Tutorias")

public class Tutorias_Controller {
	
	@Autowired
	TutoriasRepository tutoriasRepository;
	
	@PostMapping("/Create")
	public ResponseEntity<?> create(@RequestBody Tutorias tutorias){
		System.out.println(tutorias.getFecha_final() + tutorias.getFecha_inicio() + tutorias.getId_estudiante() + 
							tutorias.getId_tutor() + tutorias.getModalidad() + tutorias.getId_curso());
		return ResponseEntity.ok(tutoriasRepository.save(tutorias));
	}
	
	@GetMapping("/AllTutorias")
	public List<Tutorias> allPersons(){
		return tutoriasRepository.findAll();
	}
	
	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<?> deleteTutoria(@PathVariable int id){
		Optional<Tutorias> tutoriasDel = tutoriasRepository.findById(id);
		if(tutoriasDel.isPresent()) {
			tutoriasRepository.deleteById(id);
			return ResponseEntity.ok(tutoriasDel.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@PutMapping("/Actulizar")
	public Tutorias putTutorias(@PathVariable int id, @RequestBody Tutorias newTutorias){
		Tutorias tutoriasn = tutoriasRepository.findById(id).get();
		
		tutoriasn.setFecha_final(newTutorias.getFecha_final());
		tutoriasn.setFecha_inicio(newTutorias.getFecha_inicio());
		tutoriasn.setId_curso(newTutorias.getId_curso());
		tutoriasn.setId_estudiante(newTutorias.getId_estudiante());
		tutoriasn.setId_tutor(newTutorias.getId_tutor());
		tutoriasn.setModalidad(newTutorias.getModalidad());
		
		tutoriasRepository.save(tutoriasn);
		
		return tutoriasn;
		}
	
	
	@GetMapping("/FindTutoryByCourse/{criteria}")
	public ResponseEntity<?> findTutoryByCourse(@PathVariable Long criteria){
		
		return ResponseEntity.ok(this.tutoriasRepository.TutoryByCourse(criteria));		
	}

}
