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

import com.proyecto.entities.Persons;
import com.proyecto.repository.PersonsRepository;

@RestController
@RequestMapping("/Persons")

public class PersonsController {
	@Autowired
	private PersonsRepository personaRepository;

	@PostMapping("/Create")
	public ResponseEntity<?> create(@RequestBody Persons persona){
		System.out.println(persona.getNombre() + persona.getApellido() + persona.getCodigo() + persona.getGenero() + persona.getTelefono() + 
				persona.getCarrera() + persona.getFacultad() + persona.getTipodecarrera());
		return ResponseEntity.ok(personaRepository.save(persona));
	}

	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable int id){
		Optional<Persons> personadel = personaRepository.findById(id);
		if(personadel.isPresent()) {
			personaRepository.deleteById(id);
			return ResponseEntity.ok(personadel.get());
		}else {
			return ResponseEntity.notFound().build();

		}
	}
	@GetMapping("/AllPersons")
	public List<Persons> allPersons(){
		return personaRepository.findAll();
	}

}
