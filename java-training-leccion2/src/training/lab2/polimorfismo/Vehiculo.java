package training.lab2.polimorfismo;

public class Vehiculo {
	
	protected String matricula;
	protected String marca;
	protected String tipo;
	
	
	public Vehiculo(String matricula, String marca, String tipo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.tipo = tipo;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo;
	}
	
	
	
	

}
