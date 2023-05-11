package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.app.model.Usuario;



@Controller
public class registroController {
	
	String uri = "http://localhost:8080/api/usuarios";
	
	@RequestMapping("/registroUser")  
    public String showform(Model m){  
    	m.addAttribute("command", new Usuario());
    	return "registroUser"; 
    } 
	
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
	private String agregarUsuario(@ModelAttribute("user") Usuario user) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.postForLocation(uri, user);	
				System.out.println(user);
		return "redirect:/login";
		
	}
	

}
