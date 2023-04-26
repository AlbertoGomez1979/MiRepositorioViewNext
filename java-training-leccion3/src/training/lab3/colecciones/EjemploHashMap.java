package training.lab3.colecciones;

import java.util.HashMap;

public class EjemploHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Fruta> mapaFrutas = new HashMap<Integer, Fruta>();
		
		Fruta f1 = new Fruta("Pera", "verde");
		Fruta f2 = new Fruta("Manzana", "roja");
		
		mapaFrutas.put(1, f1);
		mapaFrutas.put(2, f2);
		mapaFrutas.put(3, f1);
		
		Fruta frutaObtenida = mapaFrutas.get(3);
		System.out.println("La fruta con clave 3: " + frutaObtenida.getNombre() + " de color " + frutaObtenida.getColor());
		
		
	}

}

	class Fruta{
		private String nombre;
		private String color;
		
		public Fruta(String nombre, String color) {
			super();
			this.nombre = nombre;
			this.color = color;
		}


		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		
		
		
	}
