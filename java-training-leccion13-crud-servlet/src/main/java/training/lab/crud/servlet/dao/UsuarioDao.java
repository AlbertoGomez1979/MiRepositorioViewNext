package training.lab.crud.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import training.lab.crud.servlet.model.Usuario;

//EJECUTA LAS CONSULTAS A LA BASE DE DATOS, SE USA JDBC PARA INTERACTUAR CON LA BASE DE DATOS
public class UsuarioDao {

	private static String jdbcURL = "jdbc:mysql://localhost:3306/bdwallet?useSSL=false";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "datasql";

	public static Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
			return connection;

	}

	/**
	 * GUARDAR USUARIO
	 * 
	 * @param usuario
	 * @return
	 */
	public static int save(Usuario usuario) {
		int status = 0;

		//LOS PARAMETROS NOMBRE, EMAIL, ETC, DEBEN COINCIDIR CON LOS DE LA BASE DE DATOS
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into usuario(nombre, nombreusuario, dni, email, password_2) values (?,?,?,?,?)")) {
			
			//SETEAMOS CADA VALOR CON LA INTERROGACION CORRESPONDIENTE.
			preparedStatement.setString(1, usuario.getNombre());
			preparedStatement.setString(2, usuario.getNombreUsuario());
			preparedStatement.setString(3, usuario.getDni());
			preparedStatement.setString(4,  usuario.getEmail());
			preparedStatement.setString(5,  usuario.getPassword());

			System.out.println(preparedStatement);

			status = preparedStatement.executeUpdate();

			//NO HACE FALTA CERRAR LA CONEXION, YA ESTÁ INCLUIDO EN LA INTERFAZ CONNECTION...
			//...PERO ES DE BUENA PRÁCTICA CERRARLA.
			connection.close();

		} catch (Exception ex) {
			ex.printStackTrace();

		}
			return status;
	}

	/**
	 * LISTAR TODOS LOS USUARIOS
	 * 
	 * @return
	 */
	public static List<Usuario> getAllUsuarios() {
		List<Usuario> list = new ArrayList<Usuario>();

		try {
			Connection connection = getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from usuario");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Usuario u = new Usuario();
				
				//los parametros se ordenan según como estén en la base de datos
				u.setIdUsuario(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setNombreUsuario(rs.getString(3));
				u.setPassword(rs.getString(4));				
				u.setEmail(rs.getString(5));
				u.setDni(rs.getString(6));
				
				list.add(u);
			}
			
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

			return list;

	}

	/**
	 * BUSCAR USUARIO POR ID
	 * 
	 * @param id
	 * @return
	 */
	public static Usuario getUsuarioById(int id) {

		Usuario u = new Usuario();

		try {
			Connection connection = getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from usuario where idusuario=?");

			ps.setInt(1, id);

			//Ejecutamos la sentencia
			ResultSet rs = ps.executeQuery();
			
			//Recorremos el resulset 
			if (rs.next()) {

				u.setIdUsuario(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setNombreUsuario(rs.getString(3));
				u.setDni(rs.getString(4));
				u.setEmail(rs.getString(5));
				u.setPassword(rs.getString(6));

			}
			
			connection.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

			return u;

	}

	/**
	 * METODO PARA ACTUALIZAR USUARIO
	 * 
	 * @param e
	 * @return
	 */
	public static int update(Usuario e) {

		int status = 0;
		try {
			Connection connection = getConnection();
			PreparedStatement ps = connection
					.prepareStatement("update usuario set nombre=?, nombreusuario=?, dni=?, email=?, password_2=? where idusuario=?");

			// SE SETEAN LOS PARAMETROS SEGUN EL ORDEN DE LAS INTERROGACIONES EN LA QUERY
			ps.setString(1, e.getNombre());
			ps.setString(2, e.getNombreUsuario());
			ps.setString(3,  e.getDni());
			ps.setString(4, e.getEmail());
			ps.setString(5, e.getPassword());

			ps.setInt(6, e.getIdUsuario());

			//SE GUARDA EL RESULTADO EL LA VARIABLE status.
			status = ps.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

			return status;
	}

	/**
	 * METODO PARA BORRAR POR ID
	 * 
	 * @param id
	 * @return
	 */
	public static int delete(int id) {

		int status = 0;

		try {
			Connection connection = getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from usuario where idusuario=?");
			
			//SETEAMOS EL PARAMETRO DE LA QUERY
			ps.setInt(1, id);
			
			status = ps.executeUpdate();

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

			return status;
	}

}
