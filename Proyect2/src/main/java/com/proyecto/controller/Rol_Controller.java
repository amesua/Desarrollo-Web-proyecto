package com.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.proyecto.entities.Rol;
import com.proyecto.repository.RolRepository;

@CrossOrigin()
@RestController
@RequestMapping("/Rol")
public class Rol_Controller {

	@Autowired
	private RolRepository rolRepository;

	@PostMapping("/Create")
	public ResponseEntity<?> create(@RequestBody Rol roles){
		System.out.println(roles.getTipo_rol());
		return ResponseEntity.ok(rolRepository.save(roles));
	}

	@GetMapping("/AllRols")
	public List<Rol> allPersons(){
		return rolRepository.findAll();
	}

	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<?> deleteRol(@PathVariable int id){
		Optional<Rol> roldel = rolRepository.findById(id);
		if(roldel.isPresent()) {
			rolRepository.deleteById(id);
			return ResponseEntity.ok(roldel.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/Actulizar")
	public Rol putRol(@PathVariable int id, @RequestBody Rol newRol){
		Rol roln = rolRepository.findById(id).get();		
		roln.setTipo_rol(newRol.getTipo_rol());
		rolRepository.save(roln);
		return roln;
		}
	
}
