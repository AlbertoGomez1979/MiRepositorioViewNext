package wallet.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wallet.app.beans.Wallet;

@Controller
public class cargarController {
	
	String uri = "http://localhost:8080/api/wallet";
	
	@RequestMapping("/cargar")  
    public String showform(Model m){  
    	m.addAttribute("command", new Wallet());
    	return "cargar"; 
	}


}
