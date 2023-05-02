package training.lab.crud.servlet.model;


public class Usuario {

	private int idUsuario;
	private String nombre;
	private String nombreUsuario;
	private String password;
	private String email;
	private String dni;	
	

	//CONSTRUCTORES
	public Usuario() {
	}
	
	public Usuario(String nombre, String nombreUsuario, String password, String email, String dni) {
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.email = email;
		this.dni = dni;
	}

	
	//GETTER Y SETTERS
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


}