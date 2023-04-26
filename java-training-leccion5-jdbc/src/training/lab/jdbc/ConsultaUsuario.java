package training.lab.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaUsuario {

	// SE DEFINEN LAS VARIABLES ESTATICAS PARA LA CONEXION
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bdwallet";
	private static final String USUARIO = "root";
	private static final String CLAVE = "datasql";

	public static void main(String[] args) throws SQLException {

		System.out.println("Consulta de BD: ");

		Connection conexion = null;

		int vidusuario = 0;
		String vnombre = null;
		String vnombreusuario = null;
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

			String consultasql;
			consultasql = "SELECT idusuario, nombre, nombreusuario, email, dni FROM bdwallet.usuario;";

			System.out.println("Iniciando consulta SQL: ");

			// Resultset dispone de un cursor que se debe recorrer para obtener los
			// registros
			ResultSet result = stmt.executeQuery(consultasql);

			// Recorremos el resultset
			while (result.next()) {
				vidusuario = result.getInt("idusuario");
				vnombre = result.getString("nombre");
				vnombreusuario = result.getString("nombreusuario");
				vemail = result.getString("email");
				vdni = result.getString("dni");
				System.out.println("Resultado: " + vidusuario + " " + vnombre + " " + vemail + " " + vdni);

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
