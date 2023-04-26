package training.lab.spring.ws.rest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



/**
 * @author Emilise Navarro
 * @Configuration Marca una clase como una clase de configuración. 
 * Esto significa que la clase proporcionará definiciones de beans.
 *
 */

@Configuration
public class WebSecurityConfig {


	/**
	 * SecurityFilterChain interfaz que representa una cadena de filtros de seguridad, esto quiere decir que se
	 * utiliza una serie de filtros para proteger las aplicaciones web contra diferentes tipos de ataques.
	 * Por ejemplo: la falsificación de solicitudes entre sitios (CSRF).
	 * La protección CSRF se implementa mediante un token CSRF generado por el servidor, 
	 * que se incluye en cada solicitud.Cuando se envía una solicitud, el token se valida para garantizar 
	 * que la solicitud proviene de un origen seguro y no de un atacante. Provee seguridad de solicitudes 
	 * maliciosas.
	 */
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager authManger) throws Exception {
		
		
		return http
				.csrf().disable() //En este caso se deabilita en caso de que el cliente que no puede manejarcorrectamente el token CSRF
				.authorizeRequests()//Permite especificar las reglas de autorización para diferentes URL, este caso permite el acceso para todos los path
				.anyRequest() //La regla de autorización predeterminada que se aplicará a cualquier solicitud entrante.
				.authenticated()//se utiliza para verificar si un usuario ha iniciado sesión en el sistema y ha sido autenticado. Este método devuelve verdadero si el usuario ha sido autenticado correctamente
				.and()// Esto significa que el acceso solo se permitirá si el usuario ha iniciado 
				.httpBasic()//Se utiliza para habilitar la autenticación HTTP básica. El cliente envía sus credenciales (nombre de usuario y contraseña) en cada solicitud HTTP
				.and()
				.sessionManagement()// Se utiliza para configurar el manejo de sesiones de usuario. Las sesiones de usuario se utilizan para mantener el estado de una sesión del usuario durante varias solicitudes HTTP
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS)//Significa que no se creará ninguna sesión para los usuarios autenticados
				.and()
				.build();//El método se utiliza para construir y devolver un objeto completo de tipo "SecurityFilterChain" después de que 
		        //se hayan establecido todas las propiedades necesarias
	}
	
	/**
	 * UserDetailsService es una interfaz que se utiliza para cargar detalles de usuario de una fuente de datos externa, 
	 * como una base de datos o un servicio web, y proporcionar estos detalles al sistema de autenticación de Spring Security.
	 * En este caso se gestiona la creación de usuario y password en memoria
	 */
	
	
	  @Bean 
	  UserDetailsService userDetailsService() { 
	  InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	  manager.createUser(User.withUsername("admin")
	         .password(passwordEncoder().encode("admin"))//aqui se pasa el password
	         .roles()//roles vacios porque no los hay aun. 
	         .build()); 
	  return  manager; 
	  
	  }
	 
	
	/**
	 * AuthenticationManager es una interfaz que se utiliza para autenticar las solicitudes de usuario, 
	 * Mediante la implementación del método "getSharedObject(AuthenticationManagerBuilder)", que establece el objeto 
	 * "UserDetailsService" para autenticar las solicitudes de usuario y un codificador de contraseñas. 
	 * Además, se ha configurado una política de seguridad en la que se requiere autenticación básica para todas las solicitudes.
	 * 
	 */
	
	@Bean
	AuthenticationManager authManager(HttpSecurity http) throws Exception {
				
		return http.getSharedObject(AuthenticationManagerBuilder.class)
				//.userDetailsService(userDetailsService())
				.userDetailsService(userDetailsService())
				.passwordEncoder(passwordEncoder())//Codificador de contraseña
				.and()
				.build();
		
	}
	
	/**
	 * PasswordEncoder es una interfaz que se utiliza para codificar contraseñas y validar contraseñas codificadas, 
	 * La implementacion se realiza a traves de BCryptPasswordEncoder algoritmo de cifrado de contraseñas bcrypt 
	 * bcrypt es un algoritmo de cifrado de contraseñas que es ampliamente utilizado debido a su capacidad para generar 
	 * contraseñas codificadas que son difíciles de crackear
	 * 
	 */
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	
}
