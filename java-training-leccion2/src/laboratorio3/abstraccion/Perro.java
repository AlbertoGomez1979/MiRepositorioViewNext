package laboratorio3.abstraccion;

public class Perro extends Animal{
	
	private int edad;

	public Perro(String raza, String tipo, String color, int edad) {
		super(raza, tipo, color);
		this.edad = edad;
	}

	//METODO DE LA INTERFAZ
	@Override
	public void imprimirPatas() { //M�todo dentro de la interfaz, sin definir, pero con el valor de "nPatas"
		System.out.println("El animal perro con : " + nPatas + " patas");
		
	}

	//M�TODO ABSTRACTO DE LA CLASE ANIMAL
	@Override
	public void imprimirInformacion() { //Este m�todo est� vaci�o en la clase Animal
		System.out.println("Animal perro con edad: " + edad + " a�os");
		
	}
	
	

}
