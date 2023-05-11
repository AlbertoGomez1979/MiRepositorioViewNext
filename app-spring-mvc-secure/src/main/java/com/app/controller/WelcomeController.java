package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.app.model.Transaccion;

@Controller
public class WelcomeController {
	
	String uri = "http://localhost:8080/api/transacciones";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage(Model model) {
		System.out.println("REDIRIGE A LA PAGINA DE BIENVENIDA");
		model.addAttribute("name", "Ariana Isabella");
		return "welcome";
	}
	
	@RequestMapping(value="/lastfive")//el mapping debe coincidir con el nombre  de la pagina JSP
	  private String lastFive(Model m) {
	  
	  RestTemplate restTemplate = new RestTemplate();
	  
	  Transaccion[] trans = restTemplate.getForObject(uri, Transaccion[].class);
	  List <Transaccion> list = Arrays.asList(trans);
	  
	  return "welcome";
	  
	  }
		 	

}
