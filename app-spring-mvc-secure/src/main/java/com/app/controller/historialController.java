package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.app.model.Transaccion;


@Controller
public class historialController {
	
	String uri = "http://localhost:8080/api/transacciones";
	
	/*
	 * @RequestMapping("/historial") public String showform(Model m){
	 * m.addAttribute("command", new Transaccion()); return "historial"; }
	 */
	
	@RequestMapping(value="/historial")//el mapping debe coincidir con el nombre  de la pagina JSP
	  private String findAll(Model m) {
	  
	  RestTemplate restTemplate = new RestTemplate();
	  
	  Transaccion[] trans = restTemplate.getForObject(uri, Transaccion[].class);
	  List <Transaccion> list = Arrays.asList(trans); m.addAttribute("list",list);
	  
	  return "historial";
	  
	  }

}
