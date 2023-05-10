package training.lab.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import training.lab.spring.mvc.beans.UsuarioRest;



@Controller
public class UsuarioRestController {
	
	 @RequestMapping("/hello")
	 @ResponseBody
	 private String hello() {
	  return "Hello World";
	 }
	 
	 @RequestMapping(value="/usuario/{id}")
	 //@ResponseBody
	 private String getUsuario(@PathVariable int id,Model m) {
		 
	  String uri = "https://jsonplaceholder.typicode.com/users/"+id;
	  
	  RestTemplate restTemplate = new RestTemplate();
	  
	  UsuarioRest usuarioRest = restTemplate.getForObject(uri, UsuarioRest.class);
	  
	  m.addAttribute("command",usuarioRest);
	  
	  System.out.println("Usuario: " + usuarioRest);
	  System.out.println("Usuarioid: " + usuarioRest.getId());	
	  System.out.println("Nombre: " + usuarioRest.getName());
	  System.out.println("Username: " + usuarioRest.getUsername());
	  System.out.println("Email: " + usuarioRest.getEmail());
	  System.out.println("Telefono: " + usuarioRest.getPhone());
	  System.out.println("WebSite: " + usuarioRest.getWebsite());
	  
	  return "usuario";// pagina donde se redirige
	}

}
