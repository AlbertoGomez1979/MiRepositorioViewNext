package training.lab4.reflectionApi;

public class Carrera {

	private int idCarrera;
	private String nombreCarrera;
	
	public Carrera(int idCarrera, String nombre) {
		super();
		this.idCarrera = idCarrera;
		this.nombreCarrera = nombre;
	}

	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	
	public String getNombre() {
		return "Matemáticas";	}


	
	
	
	
	
}
