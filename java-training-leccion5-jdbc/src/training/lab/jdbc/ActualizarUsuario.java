package training.lab.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizarUsuario {

	// SE DEFINEN LAS VARIABLES ESTATICAS PARA LA CONEXION
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bdwallet";
	private static final String USUARIO = "root";
	private static final String CLAVE = "datasql";

	public static void main(String[] args) {

		System.out.println("Actualización de BD");

		Connection conexion = null;

		String vnombreUsuario = null;
		String vemail = null;

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

			vnombreUsuario = "Pepito Pirez";
			vemail = "pepito@pepito.com";
			updatesql = "UPDATE bdwallet.usuario SET email = '" + vemail + "' WHERE nombreusuario = '" + vnombreUsuario
					+ "'";

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
}
