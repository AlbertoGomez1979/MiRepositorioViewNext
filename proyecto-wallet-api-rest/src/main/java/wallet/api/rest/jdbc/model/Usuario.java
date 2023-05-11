package wallet.api.rest.jdbc.model;

import java.util.List;

public class Usuario {

	private int idusuario;
	private String nombre;
	private String nombreusuario;
	private String dni;
	private String email;
	private String password_2;
	
	
	//ATRIBUTOS PARA LAS RELACIONES
	
	  private List<Wallet> wallet;//Relacion con la tabla wallet, Un usuario puede tener muchas wallet
	  
	  
	  
	  
	  public List<Wallet> getWallet() { return wallet; }
	  
	  public void setWallet(List<Wallet> wallet) { this.wallet = wallet; }
	 

	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, String nombreusuario, String dni,  String email, String password_2, List<Wallet> wallet) {
		super();
		this.nombre = nombre;
		this.nombreusuario = nombreusuario;
		this.dni = dni;
		this.email = email;		
		this.password_2 = password_2;
		this.wallet = wallet;
	}
	

	public int getIdUsuario() {
		return idusuario;
	}

	public void setIdUsuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getPassword_2() {
		return password_2;
	}

	public void setPassword_2(String password_2) {
		this.password_2 = password_2;
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

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", nombreUsuario=" + nombreusuario + ", password=" + password_2 + ", email="
				+ email + ", dni=" + dni + "]";
	}

}
