package training.lab2.abstraccion;

public abstract class Auto implements IAutos{
	
	protected String marca, modelo, precio;
	
	

	public Auto(String marca, String modelo, String precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public void imprimirDatos() {
		System.out.println("La marca es: " + marca);
		System.out.println("El modelo es : " + modelo);
		System.out.println("El precio es : " + precio);
	}
	
	public abstract void imprimirInformacion();
		
	


}
