package wallet.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import wallet.app.beans.Transaccion;
import wallet.app.beans.Usuario;
import wallet.app.beans.Wallet;

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
	
	
	@RequestMapping(value="/actualizar/{idwallet}", method = RequestMethod.PUT)
	private String actualizar(@PathVariable int idwallet, @ModelAttribute("wallet") Wallet wallet) {
		
		RestTemplate restTemplate = new RestTemplate();
	      
        restTemplate.put(uri +"/" + idwallet, wallet);
        
   	return "redirect:/wallets";
		
	}

}
