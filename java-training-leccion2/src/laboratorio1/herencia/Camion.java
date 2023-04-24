package laboratorio1.herencia;

public class Camion extends Vehiculo{

	
	private String modelo;
	private String marca;
	
	//Constructor con atributos propios y llamando al padre(super)
	public Camion(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public String getDatosCamion() {
		return "El camión es un modelo: " + modelo + " y de la marca: " + marca;
	}
	


}
