package training.java.spring.mvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//ANOTACION DE CONTROLADOR
@Controller
public class GreetingController {
	
	//ANOTACION DE LA RUTA
	@GetMapping("/greeting")
	//ANOTACION DE QUE TENEMOS UN PARAMETRO, name.
	public String greeting(@RequestParam(name="name", required=false, defaultValue="miarma") String name, Model model) {
		
		//AÑADIMOS AL MODEL EL ATRIBUTO name.EL MODEL ES EL OBJETO QUE LLEGA
		 model.addAttribute("name", name);
		 
		 return "greeting";
	}
	//POR DEFAULT PASA EL PARAMETRO "WORLD", PARA PONER PARAMETRO SE HACE A TRAVES DE LA URL COMO..... http://loaclhost:8080/greeting?name=Alberto

}
