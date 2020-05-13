package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Persona;
import com.example.demo.services.PersonaServices;

@Controller
public class PersonaController {

	@Autowired
	private PersonaServices personaServices;

	@RequestMapping({"/", "index"})
	public String index(Model model) {
		model.addAttribute("list", personaServices.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave( @PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			
			model.addAttribute("persona", personaServices.get(id));
			
		} else {
			
			model.addAttribute("persona", new Persona());
		}
		return "save";
	}
	//Guardar persona.
	@PostMapping("/save")
	public String save(Persona persona, Model model) {
		personaServices.save(persona);
		return "redirect:/index";
		
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		
		personaServices.delete(id);
		return "redirect:/index";
	}
	
}
