package training.lab4.lambda;

public class Persona {
	
	private String name, apellido, posicion;
	private int edad;
	
	
	public Persona(String name, String apellido, String posicion, int edad) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.posicion = posicion;
		this.edad = edad;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
