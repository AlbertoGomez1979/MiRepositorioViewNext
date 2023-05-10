package training.spring.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import training.spring.entity.User;
import training.spring.repository.UserRepository;

//ANOTACION PARA APLICACION DE SPRINGBOOT
@SpringBootApplication
//ANOTACION PARA CARGAR EL REPOSITORIO
@EnableJpaRepositories(basePackages = "training.spring.repository")
//ANOTACION PARA CARGAR LA ENTIDAD
@EntityScan("training.spring.entity")
public class JpaApplication {
	
	@Autowired
	private static UserRepository userRepository;
	
	public static void main(String[] args) {
		//Método para hacer correr las aplicaciones en jpa
		SpringApplication.run(JpaApplication.class, args);
		
	}//FINAL DEL MAIN
	
		/**
		 * @param userRepository
		 * @return
		 */
		@Bean 
		public CommandLineRunner demo(final UserRepository userRepository) {
			
			//Se crea nuevo usuario
				
//		  User user = new User("Manuel Suarez", "manuel@manuel.com", "password");
//		  System.out.println("Usuario creado!!!!");
//		  
		  //Método save en jpa, para guardar usuario 
		  //userRepository.save(user);
		  //System.out.println("Usuario guardado!!!");
		 
		  
		  //Mostrar todos los usuarios en una lista		
		/*
		 * List<User> allUsers = (List<User>) userRepository.findAll();
		 * System.out.println("-------Todos los usuarios------"); for(User user:
		 * allUsers){ System.out.println(user); System.out.println(user.getId());
		 * System.out.println(user.getName()); }
		 */
		 
		 
			
			//Obtener usuario por id.		
		/*
		 * User userById = userRepository.findById(4L);//ID long, id 2 tipo Long
		 * System.out.println("consulta por id");
		 * System.out.println(userById.getName());
		 * System.out.println(userById.getEmail());
		 */
		  
			
		  //Actualiza un registro 
		  //User existUser = userRepository.findById(2L);//ID long, id 2 tipo Long 
		  //if(existUser != null) {
		  //existUser.setEmail("prueba@prueba.com"); //Guardar
		  //userRepository.save(existUser);		  
		  //System.out.println("usuario actualizado"); System.out.println(existUser); }
		 
			
			//Eliminar Usuario		
		  //userRepository.deleteById(9L); //Se le pasa el id, que es el id 2 y de tipo Long, por eso se le pone la letra "L".		  
		  //System.out.println("usuario eliminado por id.");
		 
			
				
			
			
			
			return null;																
						
			
		}
		
		
	}


