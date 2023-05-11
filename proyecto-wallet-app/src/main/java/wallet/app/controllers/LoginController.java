package wallet.app.controllers;


import java.net.URI;
import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import wallet.app.beans.Usuario;

/**
 * 
 * @author Admin
 * Esta página es index.jsp
 *
 */
@Controller
public class LoginController {
	
		
	String uri = "http://localhost:8080/api/usuarios";
	
	@RequestMapping("/login")  
    public String showform(Model m){  
    	m.addAttribute("command", new Usuario());
    	return "login"; 
    } 


}
