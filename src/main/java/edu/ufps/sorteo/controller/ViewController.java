package edu.ufps.sorteo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import edu.ufps.sorteo.repository.BoletaRepository;


@Controller
public class ViewController {

	@Autowired
	BoletaRepository boletaRepository;
	
	@GetMapping({"/", "/index"})
	public String index(HttpServletRequest request) {
		return "index";
	}
	

	

}
