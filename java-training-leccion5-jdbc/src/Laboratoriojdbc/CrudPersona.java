package Laboratoriojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudPersona {

	// SE DEFINEN LAS VARIABLES ESTATICAS PARA LA CONEXION
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bdlab";
	private static final String USUARIO = "root";
	private static final String CLAVE = "datasql";
	
	Connection conexion = null;
	
	String vnombrepersona = null;
	int vedad;
	String vciudad = null;
	int vidpersona;

	
	public void actualizar() {
		
		System.out.println("Actualización de BD");
		
		
		// Creamos la conexion con la BD
		try {
			Class.forName(CONTROLADOR);// SE ESPECIFICA EL CONTROLADOR DEL DRIVER
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE); // CON EL DRIVERMANAGER QUE PERTENECE A
																			// CONEXION, SE ACCEDE A LA BASE DE DATOS.
			System.out.println("Conexión OK, enhorabuena!!!!");

			// Statement permite realizar operaciones contra la base de datos, importar
			// statement
			Statement stmt = conexion.createStatement();

			String updatesql;

			vnombrepersona = "Rosa";
			vedad = 26;
			
			updatesql = "UPDATE bdlab.persona SET edad = " + vedad + " WHERE nombre = '" + vnombrepersona + "'";

			stmt.executeUpdate(updatesql);

			System.out.println("Actualizacion de Usuario CORRECTA!!!!");

			// Catch para recoger excepciones o fallos
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

	}
	
	
	public void crear() {
		
		System.out.println("Crear usuario: ");

		// Creamos la conexion con la BD
		try {
			Class.forName(CONTROLADOR);// SE ESPECIFICA EL CONTROLADOR DEL DRIVER
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE); // CON EL DRIVERMANAGER QUE PERTENECE A
																			// CONEXION, SE ACCEDE A LA BASE DE DATOS.
			System.out.println("Conexión OK, enhorabuena!!!!");

			// Statemetn permite realizar operaciones contra la base de datos, importar
			// statement
			Statement stmt = conexion.createStatement();

			String crearsql;

			vnombrepersona = "Manolo";
			vedad = 58;
			vciudad = "Jaen";
			crearsql = "INSERT INTO bdlab.persona (nombre, edad, ciudad) VALUES('" + vnombrepersona+ "', '" + vedad + "', '" + vciudad + "');";

			stmt.executeUpdate(crearsql);

			System.out.println("Usuario creado correctamente!!!!!!!!");

			// Catch para recoger excepciones o fallos
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

	}
	
	
	public void eliminar() {
		

		// Creamos la conexion con la BD
		try {
			Class.forName(CONTROLADOR);// SE ESPECIFICA EL CONTROLADOR DEL DRIVER
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE); // CON EL DRIVERMANAGER QUE PERTENECE A
																			// CONEXION, SE ACCEDE A LA BASE DE DATOS.
			System.out.println("Conexión OK, enhorabuena!!!!");

			System.out.println("Eliminar persona: ");
			// Statemetn permite realizar operaciones contra la base de datos, importar
			// statement
			Statement stmt = conexion.createStatement();

			String eliminasql;

			vidpersona = 3;
			eliminasql = "DELETE FROM persona WHERE idpersona = " + vidpersona;

			stmt.executeUpdate(eliminasql);

			System.out.println("Persona eliminada correctamente!!!!!!!!");

			// Catch para recoger excepciones o fallos
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

	}
	
	public void consultar() {
		
		System.out.println("Consulta de BD: ");
		
		// Creamos la conexion con la BD
				try {
					Class.forName(CONTROLADOR);// SE ESPECIFICA EL CONTROLADOR DEL DRIVER
					conexion = DriverManager.getConnection(URL, USUARIO, CLAVE); // CON EL DRIVERMANAGER QUE PERTENECE A
																					// CONEXION, SE ACCEDE A LA BASE DE DATOS.
					System.out.println("Conexión OK, enhorabuena!!!!");

					// Statemetn permite realizar operaciones contra la base de datos, importar
					// statement
					Statement stmt = conexion.createStatement();

					String consultasql;
					consultasql = "SELECT idpersona, nombre, edad, ciudad FROM bdlab.persona;";

					System.out.println("Iniciando consulta SQL: ");

					// Resultset dispone de un cursor que se debe recorrer para obtener los
					// registros
					ResultSet result = stmt.executeQuery(consultasql);

					// Recorremos el resultset
					while (result.next()) {
						vidpersona = result.getInt("idpersona");
						vnombrepersona = result.getString("nombre");
						vedad = result.getInt("edad");
						vciudad = result.getString("ciudad");
						
						System.out.println("Resultado: " + vidpersona + " " + vnombrepersona + " "+ vedad + " "+ vciudad);

					}
					// Catch para recoger excepciones o fallos
				} catch (ClassNotFoundException e) {
					System.out.println("Error al cargar el controlador");
					e.printStackTrace();

				} catch (SQLException e) {
					System.out.println("Error en la conexión");
					e.printStackTrace();
				}

			}
		
		
}
		
	

		
	
	
	
	

	
	

