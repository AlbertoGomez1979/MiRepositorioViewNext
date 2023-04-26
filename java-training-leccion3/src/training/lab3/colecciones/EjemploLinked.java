package training.lab3.colecciones;

import java.util.LinkedList;

public class EjemploLinked {

	public static void main(String[] args) {
		
		LinkedList<Bebida> bebidas = new LinkedList<Bebida>();
		
		bebidas.add(new Bebida("Fanta", 1.5));
		bebidas.add(new Bebida("Coca-cola", 2));
		
		for(Bebida b : bebidas) {
			System.out.println("La bebida " + b.getNombre() + " tiene " + b.getCapacidad() + " litros" );
		}

	}

}

class Bebida{
	private String nombre;
	private double capacidad;
	
	public Bebida(String nombre, double capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
