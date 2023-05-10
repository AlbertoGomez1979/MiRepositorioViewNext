package training.lab.spring.mvc.beans;

public class Empleado {
	
	private int empleado_id;
	private String nombre, apellido, departamento;
	private float salario;
	private int edad;
	
	
	public int getEmpleado_id() {
		return empleado_id;
	}
	
	public void setEmpleado_id(int empleado_id) {
		this.empleado_id = empleado_id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
