package training.laboratorio;

import jakarta.persistence.*;

@Entity
@Table(name= "usuario")
public class Usuario {
	
	@Id // PK de la tabla
	@SequenceGenerator( // Con esto indicamos que el ID se genera secuencialmente y comienza en 10
			name = "idusuario_seq", sequenceName = "idusuario_seq", allocationSize = 1, initialValue = 50) 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idusuario_seq")
	private int idusuario;
	
	@Column
	private String nombre;
	@Column 
	private String nombreUsuario;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String fecha;
	
	
	public Usuario(String nombre, String nombreUsuario, String password, String email, String fecha) {
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.email = email;
		this.fecha = fecha;
	}


	public Usuario() {
		super();
	}


	public int getIdUsuario() {
		return idusuario;
	}


	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
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


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Usuario [idusuario =" + idusuario + ", nombre=" + nombre + ", nombreUsuario=" + nombreUsuario + ", password="
				+ password + ", email=" + email + ", fecha=" + fecha + "]";
	}
	
	
	
	

}
