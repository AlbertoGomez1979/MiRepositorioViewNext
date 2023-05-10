package training.lab.rest.jdbc.model;

public class Empleado {
	
	private int empleado_id;
	private String nombre, apellido, departamento;
	private float salario;
	private int edad;

	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, String apellido, String departamento, float salario, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.salario = salario;
		this.edad = edad;
	}
	
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


	@Override
	public String toString() {
		return "Empleado [empleado_id=" + empleado_id + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", departamento=" + departamento + ", salario=" + salario + ", edad=" + edad + "]";
	}
	
	
	
	

}
