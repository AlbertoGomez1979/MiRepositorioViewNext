package training.lab4.stream;

public class Vehiculo {
	
	private String matricula;
	private Modelo modelo;
	private int kilometros;
	
	//enum es un listado especifico de constantes
	//Se enumeran los tipos de modelo
	enum Modelo{
		BMW,
		AUDI,
		OPEL,
		CITROEN;
	}

	public Vehiculo(String matricula, Modelo modelo, int kilometros) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.kilometros = kilometros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", kilometros=" + kilometros + "]";
	}
	
	

}
