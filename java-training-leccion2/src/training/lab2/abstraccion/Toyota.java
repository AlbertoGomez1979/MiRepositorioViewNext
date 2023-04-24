package training.lab2.abstraccion;

public class Toyota extends Auto{
	
	private String velocidad;


	public Toyota(String marca, String modelo, String precio, String velocidad) {
		super(marca, modelo, precio);
		this.velocidad = velocidad;
	}

	@Override
	public void imprimirNpuertas() {
		System.out.println("Auto Toyota con número de puertas : " +  nPuertas); //nPuertas es de la clase Iauto
				
	}

	@Override
	public void imprimirInformacion() {
		System.out.println("Auto Toyota y con velocidad de : " + velocidad );
		
	}


}
