package training.lab.hibernate.jpa.persistence;

import javax.persistence.*;

//Se implementan las funcionalidades de acceso a la base de datos y operaciones
public class JpaPersistence {
	
	//variable con el nombre de la unidad de persistencia
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	
	//Creamos variable EntityManager que conecta a la base de datos
	private static EntityManagerFactory factory;
	
	//Metodo para la conexion
	public static EntityManagerFactory getEntityManagerfactory() {
		//Comporbamos que la persistencia factory existe
		if(factory == null) {
			//Creamos la conexion
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);		
		}
		//Devolvemos la conexion
		return factory;
		
	}
	
	//Metodo para liberar el objeto de EntityManager, cerrando la conexión
	public static void shutDown() {
		
		if(factory != null) {
			//Cerramos la conexión 
			factory.close();
		}
		
	}
	

}
