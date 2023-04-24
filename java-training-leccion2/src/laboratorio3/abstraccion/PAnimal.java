package laboratorio3.abstraccion;

public class PAnimal {

	public static void main(String[] args) {
		
		//Instanciamos el objeto perro, asignandole los valores. Los 3 primeros son atributos del padre y el último es atributo propio de la clase Perro
		Perro pe = new Perro("Pitbull", "Americano", "Negro", 10);
		
		//Llamamos a los metodos abstractos heredados del padre y de la interfaz
		pe.imprimirdatos();
		pe.imprimirInformacion();
		pe.imprimirPatas();
		
	}

}
