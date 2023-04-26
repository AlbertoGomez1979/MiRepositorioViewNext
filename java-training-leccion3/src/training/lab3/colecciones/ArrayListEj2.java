package training.lab3.colecciones;

import java.util.ArrayList;

public class ArrayListEj2 {
	
	public static void main(String[] args) {
		
		//Creamos el arrayList
	ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	
	//creamos objetos de la clase persona
	Persona person1 = new Persona("Juan", 25);
	Persona person2 = new Persona("Marta", 33);
	
	//Añadimos al array
	listaPersonas.add(person1);
	listaPersonas.add(person2);
	
	//Mostramos los resultados
	for(Persona p: listaPersonas) {
		System.out.println("Nombre: " + p.getNombre() + " edad: " + p.getEdad());
	}
	
	}
	
}

//Clase Persona para añadir objetos al Array
 class Persona{
	 
	 private String nombre;
	 private int edad;
	 
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	 
	
	 
	 
	 
	 }
 