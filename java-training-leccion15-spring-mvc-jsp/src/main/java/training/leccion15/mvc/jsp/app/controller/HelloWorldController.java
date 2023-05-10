package training.leccion15.mvc.jsp.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	private String message = "Primera página JSP";
	
	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("message", this.message);
		
		//DEVUELVE LA VISTA DENTRO DE WEB-INF
		return "helloWorld";
	}

}
