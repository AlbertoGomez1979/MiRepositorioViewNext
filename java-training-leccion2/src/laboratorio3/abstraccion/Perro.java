package laboratorio3.abstraccion;

public class Perro extends Animal{
	
	private int edad;

	public Perro(String raza, String tipo, String color, int edad) {
		super(raza, tipo, color);
		this.edad = edad;
	}

	//METODO DE LA INTERFAZ
	@Override
	public void imprimirPatas() { //Método dentro de la interfaz, sin definir, pero con el valor de "nPatas"
		System.out.println("El animal perro con : " + nPatas + " patas");
		
	}

	//MÉTODO ABSTRACTO DE LA CLASE ANIMAL
	@Override
	public void imprimirInformacion() { //Este método está vaciío en la clase Animal
		System.out.println("Animal perro con edad: " + edad + " años");
		
	}
	
	

}
