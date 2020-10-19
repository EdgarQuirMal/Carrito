package com.prueba.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dao.PersonaDAO;
import com.prueba.model.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {

	@Autowired
	private PersonaDAO personaDAO;
	
	//get 
	@PostMapping("/guardar")	//localhost:8080/personas/guardar
	public void guardar(@RequestBody Persona p) {
		personaDAO.save(p);
	}
	
	
	@CrossOrigin
	@GetMapping("/listar")
	public List<Persona> listar(){
		
		return personaDAO.findAll();
	}

	@CrossOrigin
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		personaDAO.deleteById(id);
		
	}
	
	@CrossOrigin
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona p) {
		personaDAO.save(p);
	}
	
	
	@CrossOrigin
	@RequestMapping("/allBySexo")
	public Iterable<Persona> getPersonaBySexo(@RequestParam String sexo) {
	   return personaDAO.findBySexo(sexo);
	}
}
