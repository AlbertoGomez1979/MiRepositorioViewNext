package training.lab2.abstraccion;

public class Kia extends Auto{
	
	private String color;

	public Kia(String marca, String modelo, String precio, String color) {
		super(marca, modelo, precio);
		this.color = color;
	}

	@Override
	public void imprimirNpuertas() {
		System.out.println("Auto Kia con número de puertas : " +  nPuertas); //nPuertas es de la clase Iauto
				
	}

	@Override
	public void imprimirInformacion() {
		System.out.println("Auto kia: " + marca + " y con color: " + color);
		
	}

}
