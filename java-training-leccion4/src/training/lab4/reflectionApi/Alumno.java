package training.lab4.reflectionApi;

public class Alumno {

	private int id;
	private String nombre, apellido, carrera;
	
	public Alumno(int id, String nombre, String apellido, String carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
}
