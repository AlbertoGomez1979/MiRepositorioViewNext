package training.lab3.colecciones;

import java.util.ArrayList;

/*Uso de ArrayList

Crear un nuevo ArrayList llamado nombres, a�ade varios elementos al 
ArrayList utilizando el m�todo add(), imprimir los elementos*/


public class ArrayListEj {

	public static void main(String[] args) {
		
		
		//crear arraylist
		ArrayList<String> nombres = new ArrayList<>();
		
		//ArrayList<Integer> userAgeList = new ArrayList<>();
		
		//A�adir al array
		nombres.add("Juan");
		nombres.add("Pedro");
		
		//Mostrar resultados
		System.out.println("Los nombres del array son: " );
		for(String nombre :nombres) {
			System.out.println(nombre);
		}
		
		//tama�o
		int tamaño = nombres.size();
		System.out.println("Tama�o del array: " + tamaño);
		
		//Mostrar una posicion del Array
		String segundo = nombres.get(1);
		System.out.println("El segundo es: " + segundo);
		
		
		nombres.remove(0);
		System.out.println("Despues de eliminar el nombre 0, los nombres del array son: ");
		//Recorremos el array
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
	}

}
