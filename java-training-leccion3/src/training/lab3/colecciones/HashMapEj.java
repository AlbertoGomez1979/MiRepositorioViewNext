package training.lab3.colecciones;

import java.util.HashMap;

//CON HASHMAP PUEDES PONER A CUALQUIER OBJETO EL INDICADOR QUE QUIERAS. SE LE ASIGNAN KEYS A LOS OBJETOS
public class HashMapEj {

	public static void main(String[] args) {
		
		//creamos el mapa de productos
		HashMap<Integer, Producto> mapaProductos = new HashMap<Integer, Producto>();
		
		//Creamos algunos productos
		Producto p1 = new Producto("leche", 2.50);
		Producto p2 = new Producto("arroz", 3.0);
		
		//Añadimos al hashmap
		mapaProductos.put(1, p1);
		mapaProductos.put(2, p2);
		
		//Mostramos resultados
		Producto productoObtenido = mapaProductos.get(1);
		System.out.println("Producto con clave 1: " + productoObtenido.getNombre());
	}
	
}
	
	class Producto{
		private String nombre;
		private double precio;
		
		public Producto(String nombre, double precio) {
			super();
			this.nombre = nombre;
			this.precio = precio;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		
		
		
	}


