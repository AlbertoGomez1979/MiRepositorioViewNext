package training.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//JPA proporciona un mecanismo para gestionar la persistencia y la relación con los objetos
//JPA usa anotaciones para configurar el mapeo entre objetos y tablas

//Indica que es una tabla de la base de datos
@Entity
public class User {
	
		//Anotacion de JPA para indicar que la clave primaria y que es autoincremental
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		private String name;

		private String email;

		private String password;
	
		
		//Constructor
		public User() {
			super();
		}

		//NO PASAMOS EL ID PORQUE ESTA ANOTADO PARA SER AUTOINCREMENT
		public User(String name, String email, String password) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
		}

		//Getter y Setter
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
	
}
