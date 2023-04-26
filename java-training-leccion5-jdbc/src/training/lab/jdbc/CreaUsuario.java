package training.lab.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreaUsuario {

	// SE DEFINEN LAS VARIABLES ESTATICAS PARA LA CONEXION
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bdwallet";
	private static final String USUARIO = "root";
	private static final String CLAVE = "datasql";

	public static void main(String[] args) {
		System.out.println("Crear usuario: ");

		Connection conexion = null;

		String vnombre = null;
		String vnombreusuario = null;
		String vpassword = null;
		String vemail = null;
		String vdni = null;

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

			vnombre = "Manolo";
			vnombreusuario = "Manolo";
			vpassword = "JN3999";
			vemail = "manolo@manolo.COM";
			vdni = "54226688P";
			crearsql = "INSERT INTO bdwallet.usuario (nombre, nombreusuario, password_2, email, dni) VALUES('" + vnombre
					+ "', '" + vnombreusuario + "', '" + vpassword + "', '" + vemail + "', '" + vdni + "');";

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

}
