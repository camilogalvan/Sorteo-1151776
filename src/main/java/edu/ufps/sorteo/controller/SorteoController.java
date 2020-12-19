package edu.ufps.sorteo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.ufps.sorteo.entities.Sorteo;
import edu.ufps.sorteo.repository.SorteoRepository;


@Controller
public class SorteoController {

	@Autowired
	SorteoRepository sorteoRepository;
		
	@GetMapping("/registroSorteo")
	public String registroSorteo(HttpServletRequest request, Model model) {
		
		model.addAttribute("sorteo", new Sorteo());
		
		return "registroSorteo";
	}
	
	@GetMapping("/listarSorteos")
	public String listarSorteos(HttpServletRequest request, Model model) {
		
		model.addAttribute("list", this.sorteoRepository.findAll());
		
		return "tabla_Sorteo";
	}
	
	@PostMapping("/registroSorteo")
	public String registroSorteoPost(@ModelAttribute(value="sorteo") Sorteo sorteo, RedirectAttributes redirectAttrs) {
		this.sorteoRepository.save(sorteo);
		
		return "redirect:/index";
	}
	


}
