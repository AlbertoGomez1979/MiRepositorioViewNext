package training.lab3.colecciones;


import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		//CREAR LISTA DE CADENAS
		List<String> lista = new ArrayList<>();
		
		//AGREGAR ELEMENTOS
		lista.add("Leccion 1");
		lista.add("Leccion 2");
		lista.add("Leccion 3");
		
		//OBTENER TAMAÑO
		System.out.println("Tamañao: " + lista.size());
		
		//ACCEDER A ELEMENTOS
		System.out.println("Primer elemento de la lista " + lista.get(1));
		
		//ITERAC SOBRE LA LISTA Y MOSTRAR ELEMENTOS
		System.out.println("ELEMENTOS: ");
		for( String elemento : lista) {
			System.out.println(elemento);
		}
		
		//ELIMINAR ELEMENTO
		lista.remove(2);
		
		//ITERAC SOBRE LISTA ACTUALIZADA
		
		
		
		
	}

}
