package com.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prueba.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona,Integer> {
	

	@Query("select p from Persona p where p.sexo = ?1")
	Iterable<Persona> findBySexo(String sexo);

}
