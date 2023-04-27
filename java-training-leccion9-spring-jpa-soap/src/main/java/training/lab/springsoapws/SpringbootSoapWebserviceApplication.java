
package training.lab.springsoapws;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Emilise Navarro
 * Esta clase es la clase principal es la encargada de arrancar nuestra aplicaciÃ³n de Spring
 * no hace falta desplegarla en un servidor web ya que Spring Boot provee uno embebido
 * La anotaciÃ³n @SpringBootApplication es la encargada de scanear los componentes(@ComponentScan)
 * ademas habilita el mecanismo de configuraciÃ³n automÃ¡tica(@EnableAutoConfiguration) y permite registrar 
 * beans adicionales en el contexto o importar clases de configuraciÃ³n adicionales(@Configuration)
 */
@SpringBootApplication 
public class SpringbootSoapWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSoapWebserviceApplication.class, args);
	}
}
