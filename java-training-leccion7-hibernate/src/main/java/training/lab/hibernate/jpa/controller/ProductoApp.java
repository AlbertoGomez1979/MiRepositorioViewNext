package training.lab.hibernate.jpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

import training.lab.hibernate.jpa.model.Producto;
import training.lab.hibernate.jpa.persistence.JpaPersistence;

//Clase para probar la persistencia
public class ProductoApp {

	
	public static void main(String[] args) {
		
		int opcion  = 0; //iniciamos las opciones
		try(Scanner scanner = new Scanner(System.in)){
			//Para leer los datos que se introduce por teclado
			
			Producto producto; //Variable tipo Producto, que es el modelo
			
			//Entity para crear la conexion
			EntityManager entity = JpaPersistence.getEntityManagerfactory().createEntityManager();
			
			//Hacemos Un Loop para ingresar el numero de opciones
			while(opcion!=5) {
				//Opciones para elegir
				System.out.println("Elija una opción: ");
				System.out.println("1. Crear producto");
				System.out.println("2. Buscar producto");
				System.out.println("3. Actualizar producto");
				System.out.println("4. Eliminar producto");
				System.out.println("5. Salir");

				opcion = scanner.nextInt();
				
				switch(opcion) {
				
				case 1:
					System.out.println("Ingrese nombre del producto");
					producto = new Producto();//Iniciamos el objeto
					scanner.nextLine(); 
					producto.setNombre(scanner.nextLine());//seteamos el valor al nombre a través del scanner
					
					System.out.println("Ingrese el precio del producto:");
					producto.setPrecio(scanner.nextDouble()); //Precio del producto
					System.out.println(producto);
					
					//A traves de objeto entity
					entity.getTransaction().begin(); //aqui le digo que inicie la transacción
					entity.persist(producto); //aqui le indico a través del método persidt que guarde en BD
					entity.getTransaction().commit(); //aqui le indico que culmine
					
					System.out.println("Producto registrado!!!");
					System.out.println();
					break;
					
				
				case 2:
					System.out.println("Digite el id del producto a buscar:");
					producto = new Producto(); ////instaciamos al objeto
					//con el método find realiza una búsqueda por id en la tabla
					//le pasamos dos parametros, la clase Producto y el ID a través del scanner
					
					producto = entity.find(Producto.class, scanner.nextLong()); 
					
					if (producto != null) { //aqui validamos si es diferente de null
						System.out.println(producto); //imprimimos el producto
						System.out.println();
					} else {
						System.out.println(); 
						//Me indica el mensaje y me muestra una lista de todos los productos
						System.out.println("Producto no encontrado... Lista de productos completa");
						//Para obtener la lista creamos una Lista2
						List<Producto> listaProductos= new ArrayList<>();
						// Creamos una variable de tipo Query y a través del método createQuery Obtenemos la lista con una consulta JPQL 						
						//(p es una alias)
						Query query = entity.createQuery("SELECT p FROM Producto p"); //La query hace referencia a la clase POJO, que es la clase Producto.
						//con el método getResultList obtenemos la lista 
						listaProductos=query.getResultList(); 
						
						for (Producto p : listaProductos) { //recorremos la lista
							System.out.println("Id : " + p.getId() + " Nombre : " + p.getNombre()); // se imprime la lista de los nombres
						}
						
						System.out.println();
					}

					break;

				case 3:
					System.out.println("Ingrese el id del producto a actualizar:");
					producto = new Producto();

					producto = entity.find(Producto.class, scanner.nextLong()); //con el método find buscamos el producto con el ID que ingresamos por teclado
					
					if (producto != null) { //Si el producto está....
						
						System.out.println(producto); //imprime el producto
						System.out.println("Digite el nuevo nombre del producto:"); //Nuevo nombre
						scanner.nextLine();
						producto.setNombre(scanner.nextLine());//Setea el nombre que se le pasa por consola 
						
						System.out.println("Digite el nuevo precio del producto:"); //Ingresamos el nuevo precio
						producto.setPrecio(scanner.nextDouble());//setea nuevo precio
						
						entity.getTransaction().begin(); //iniciamos la transacción
						entity.merge(producto); // Update a la tabla
						entity.getTransaction().commit(); //cerramos la transacción
						
						System.out.println("Producto actualizado.." + producto);
						System.out.println();
					} else {
						System.out.println("Producto no encontrado....");
						System.out.println();
					}
					break;
					
				case 4:
					System.out.println("Digite el id del producto a eliminar:");
					producto = new Producto();

					producto = entity.find(Producto.class, scanner.nextLong()); //buscamos el producto por el ID
					if (producto != null) {
						System.out.println(producto);
						
						entity.getTransaction().begin();
						entity.remove(producto); // con el método remove eliminamos el registro
						entity.getTransaction().commit();
						
						System.out.println("Producto eliminado...");
					} else {
						System.out.println("Producto no encontrado...");
					}
					break;
					
				case 5:
					entity.close();
					JpaPersistence.shutDown();
					break;
					
				default:
					System.out.println("Opción no válida\n");
					break;
				}
				
			}
			
		}
		

	}

}
