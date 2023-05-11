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
public class userPageController {
	
	String uri = "http://localhost:8080/api/transacciones";
	
	/*
	 * @RequestMapping("/userPage") public String showform(Model m){
	 * m.addAttribute("command", new Transaccion()); return "userPage"; }
	 */

	
	  
	  @RequestMapping(value="/userPage")//el mapping debe coincidir con el nombre  de la pagina JSP
	  private String lastFive(Model m) {
	  
	  RestTemplate restTemplate = new RestTemplate();
	  
	  Transaccion[] trans = restTemplate.getForObject(uri + "/" + "lastFive", Transaccion[].class);
	  List <Transaccion> list = Arrays.asList(trans);
	  
	  return "userPage";
	  
	  }
	 
	  
}
