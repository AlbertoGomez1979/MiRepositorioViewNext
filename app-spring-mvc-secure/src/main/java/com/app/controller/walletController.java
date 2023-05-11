package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.app.model.Wallet;



@Controller
public class walletController {
	
	String uri = "http://localhost:8080/api/wallets";
	
	/*
	 * @RequestMapping("/wallets") public String showform(Model m){
	 * m.addAttribute("command", new Usuario()); return "wallets"; }
	 */
	
	
	
	@RequestMapping(value="/wallets")
	private String findAll(Model m) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Wallet[] wallet = restTemplate.getForObject(uri, Wallet[].class);
		  List <Wallet> list = Arrays.asList(wallet);
	
		return "wallets";
		
		
	}

}
