package training.spring.mvc.app.beans;

public class Empleado {
	
	private int empleado_id;  
	private String nombre;
	private String apellido;
	private float salario;  
	private int edad;
	/**
	 * @return the id
	 */
	public int getEmpleado_id() {
		return empleado_id;
	}
	/**
	 * @param id the id to set
	 */
	public void setEmpleado_id(int empleado_id) {
		this.empleado_id = empleado_id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the salario
	 */
	public float getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	} 
	
	

}
