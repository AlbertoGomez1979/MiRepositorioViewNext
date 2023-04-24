package laboratorio3.abstraccion;

public abstract class Animal implements IAnimal{
	
	private String raza, tipo, color;

	public Animal(String raza, String tipo, String color) {
		super();
		this.raza = raza;
		this.tipo = tipo;
		this.color = color;
	}
	
	public void imprimirdatos() {
		System.out.println("Raza: " + raza);
		System.out.println("tipo: " + tipo);
		System.out.println("color: " + color);
	}
	
	public abstract void imprimirInformacion();

}
