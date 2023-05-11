package wallet.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import wallet.app.beans.Transaccion;
import wallet.app.beans.Usuario;

@Controller
public class transferController {

		
		String uri = "http://localhost:8080/api/wallets";
		
		@RequestMapping("/transfer")  
	    public String showform(Model m){  
	    	m.addAttribute("command", new Transaccion());
	    	return "transfer"; 
		}
		
		


}
