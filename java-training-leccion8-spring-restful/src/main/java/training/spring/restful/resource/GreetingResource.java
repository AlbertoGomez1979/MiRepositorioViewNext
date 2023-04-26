package training.spring.restful.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import training.spring.restful.domain.Greeting;

//Recurso del servicio, indica que es un servicio REST
@RestController
public class GreetingResource {
	
	private static final String template = "Hello, %s!"; //el indicador %s indica que es una varible, en este caso lo que se le pase al "name".
	
	//ruta, que es tipo GET
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value ="name", defaultValue ="World") String name) { //requestparam indica que tiene parametros y el tipo de parametro
		
		//Crea un nuevo greeting con el id(12) y el content, al que se le pasa el template indicado arriba
		return new Greeting(12, String.format(template, name));
	}

}
