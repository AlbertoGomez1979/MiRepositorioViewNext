package training.lab.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//CLASE PARA CONECTAR CON LA BASE DE DATOS. EN EL PROYECTO. AÑADIR EL DRIVER DE MYSQL-CONECTOR  A LAS LIBRERIAS DEL PROYECTO.
public class Testconexion {

	//SE DEFINEN LAS VARIABLES ESTATICAS PARA LA CONEXION
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bdwallet";
	private static final String USUARIO = "root";
	private static final String CLAVE = "datasql";
	
	public static void main(String[] args) {
		
	        System.out.println("Prueba de conexion con la BD: ");
	        
	        	//OBJETO CONEXION.
	    		Connection conexion = null;
	    		
	    		try {
	    			Class.forName(CONTROLADOR);//SE ESPECIFICA EL CONTROLADOR DEL DRIVER
	    			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE); //CON EL DRIVERMANAGER QUE PERTENECE A CONEXION, SE ACCEDE A LA BASE DE DATOS.
	    			System.out.println("Conexión OK, enhorabuena!!!!");

	    		} catch (ClassNotFoundException e) {
	    			System.out.println("Error al cargar el controlador");
	    			e.printStackTrace();

	    		} catch (SQLException e) {
	    			System.out.println("Error en la conexión");
	    			e.printStackTrace();
	    		}
	    		
	    		
	    	}
	        
		
	}


