package edu.ufps.sorteo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.ufps.sorteo.entities.Persona;
import edu.ufps.sorteo.entities.Sorteo;
import edu.ufps.sorteo.repository.PersonaRepository;



@Controller
public class PersonaController {

	@Autowired
	PersonaRepository personaRepository;
		
	@GetMapping("/registroPersona")
	public String registroPersona(HttpServletRequest request, Model model) {

		model.addAttribute("persona", new Persona());
		
		return "registroPersona";
	}
	
	@PostMapping("/registroPersona")
	public String registroPersonaPost(@ModelAttribute(value="persona") Persona persona, RedirectAttributes redirectAttrs) {
		this.personaRepository.save(persona);
		
		return "redirect:/index";
	}
	


}
