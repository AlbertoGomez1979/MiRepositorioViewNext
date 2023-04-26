package training.spring.restful.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication   //INDICA QUE ES UNA APLICACION SPRINGBOOT
@ComponentScan("training.spring.restful.*")  //INDICA QUE CLASES SE VAN A USAR PARA LOS SERVICIOS, ESCANEA LAS ETIQUETAS RESTCONTROLLER.
public class RestServiceApplication {

	//Clase para exponer o arrancar el servicio REST.
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
