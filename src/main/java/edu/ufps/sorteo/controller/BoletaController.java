package edu.ufps.sorteo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.ufps.sorteo.entities.Boleta;
import edu.ufps.sorteo.repository.BoletaRepository;


@Controller
public class BoletaController {

	@Autowired
	BoletaRepository boletaRepository;
	
	/*@GetMapping({"/", "/index"})
	public String index(HttpServletRequest request) {
		Boleta b = new Boleta();
		this.boletaRepository.save(b);
		return "index";
	}
	
	@GetMapping("/finish")
	public String finish(HttpServletRequest request) {
		return "finish";
	}	
	
	*/

}
