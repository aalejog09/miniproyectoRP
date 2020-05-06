package com.example.demo.services.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.commons.GenericServicesImpl;
import com.example.demo.models.Persona;
import com.example.demo.repositories.PersonaRepository;
import com.example.demo.services.PersonaServices;

@Service
public class PersonaServiceImpl extends GenericServicesImpl <Persona, Long> implements PersonaServices{

	@Autowired
	private PersonaRepository personaDaoApi;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		return personaDaoApi;
	}

}
