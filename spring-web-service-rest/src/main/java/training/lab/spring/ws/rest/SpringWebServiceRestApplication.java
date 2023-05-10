package training.lab.spring.ws.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringWebServiceRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebServiceRestApplication.class, args);
	}

}
