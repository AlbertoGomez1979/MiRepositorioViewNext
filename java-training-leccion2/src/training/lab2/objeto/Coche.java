package training.lab2.objeto;

public class Coche {
	
	//Atributos
	String color;
	String Velocidad;
	String fabricante;
	String modelo;
	String precio;
	String carburante;

	//Constructor vacío
	public Coche() {	
		super();
	}
	
	//Constructor
	public Coche(String color, String velocidad, String fabricante, String modelo, String precio, String carburante) {
		super();
		this.color = color;
		Velocidad = velocidad;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.precio = precio;
		this.carburante = carburante;
	}
	
	//Métodos
	static void parar() {
		System.out.println("Los métodos estaticos se pueden llamar sin crear objetos");
	}
	
	public void arrancar() {
		System.out.println("Los métodos públicos deben llamarse mediante la creación de objetos");
	}


	//Getter y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(String velocidad) {
		Velocidad = velocidad;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}

	

}
