package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
	
	

}
