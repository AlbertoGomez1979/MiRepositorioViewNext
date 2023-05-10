package training.spring.mvc.app.controllers;


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

import training.spring.mvc.app.beans.Empleado;

@Controller
public class EmpleadoController {
	
	
	
	
	String uri = "http://localhost:8080/api/empleados";
	
	@RequestMapping("/empform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Empleado());
    	return "empform"; 
    } 
	
	@RequestMapping(value="/empleados")//el mapping debe coincidir con el nombre de la pagina JSP
	private String getAllEmpleado(Model m) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Empleado[] empleados  = restTemplate.getForObject(uri, Empleado[].class);
		List <Empleado> list = Arrays.asList(empleados);
		m.addAttribute("list",list);
		//System.out.println("Empleado: " + list);
				
		return "empleados";
		
	}
	
	@RequestMapping(value="/editaremp/{empleado_id}", method = RequestMethod.GET)
	private String getEmpleadoById(@PathVariable int empleado_id,Model m) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Empleado empleado = restTemplate.getForObject(uri +"/" + empleado_id, Empleado.class);
		m.addAttribute("command",empleado);
		//System.out.println("Empleado: " + empleado);
		return "editaremp";
		
	}
	
	@RequestMapping(value="/actualizar/{empleado_id}", method = RequestMethod.POST)
	private String actualizar(@PathVariable int empleado_id, @ModelAttribute("emp") Empleado emp) {
		
		RestTemplate restTemplate = new RestTemplate();
	      
        restTemplate.put(uri +"/" + empleado_id, emp);
        
        //restTemplate.put(url, request);
        
   	return "redirect:/empleados";
		
	}
	
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
	private String agregarEmpleado(@ModelAttribute("emp") Empleado emp) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.postForLocation(uri, emp);	
				
		return "redirect:/empleados";
		
	}
	
	
	@RequestMapping(value="/eliminaremp/{empleado_id}")
	private String eliminarById(@PathVariable int empleado_id) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.delete(uri +"/" + empleado_id);
		
		return "redirect:/empleados";
		
	}

}
