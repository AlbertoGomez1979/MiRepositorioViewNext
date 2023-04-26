package training.lab3.colecciones;

import java.util.LinkedList;

public class LinkedEj {

	public static void main(String[] args) {
		
		//Creamos el linked
		LinkedList<Estudiante> estudiantes = new LinkedList<Estudiante>();
		
		//Añadimos objetos
		estudiantes.add(new Estudiante("Ana", 20));
		estudiantes.add(new Estudiante("Pedro", 32));
	
		//Mostramos los objetos dentro de linked
		for(Estudiante e : estudiantes) {
			System.out.println(e.getNombre() + " tiene " + e.getEdad() + " años");
		}
	
	}

}

class Estudiante{
	private String nombre;
	private int edad;
	
	public Estudiante(String nombre, int edad) {
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
