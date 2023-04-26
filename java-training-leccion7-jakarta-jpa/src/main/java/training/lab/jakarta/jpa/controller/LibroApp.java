package training.lab.jakarta.jpa.controller;

import jakarta.persistence.*;
import training.lab.jakarta.jpa.model.Libro;

//Clase para ejecutar. JAKARTA CREA AUTOMATICAMENTE LAS TABLAS, NO HAY QUE HACERLAS MANUALMENTE.
//AL LANZAR LA CONSULTA DE INSERTAR/CREAR, SE CREA LA TABLA
public class LibroApp {

	public static void main(String[] args) {

		// Variables para la conexion CON LA BASE DE DATOS
		EntityManagerFactory emf = null;
		EntityManager em = null;

		try {
			emf = Persistence.createEntityManagerFactory("default"); //TOma el nombre de persistence.xml
			em = emf.createEntityManager();

//			Libro l1 = new Libro("librito uno", 30.40);
//			Libro l2 = new Libro("librito DOS", 20.12);
//			Libro l3 = new Libro("librito TRES", 7.6);
////
////			// Insertando
//			em.getTransaction().begin();
//			// Persiste el objeto
//			em.persist(l1);
//			em.persist(l2);
//			em.persist(l3);
//			// Hacemos el commit para guardarlo
//			em.getTransaction().commit();
//			System.out.println("------Libro insertado con persist!!!!!!!----");

			// Borrado
			em.getTransaction().begin(); // Inicio de la transaccion
			
			Libro b = em.find(Libro.class, 111);//Mostrar libro que se va a borrar
			System.out.println(b);
			
			em.remove(b);//Borramos el libro contenido en la variable "b"
			em.getTransaction().commit();
			System.out.println("-------Borrado completado-------");
			

			// Update
//			em.getTransaction().begin();
//			Libro selected = em.find(Libro.class, 101); // Buscamos el ID
//			selected.setNombre("Cambio de nombre");
//			em.persist(selected);
//			em.getTransaction().commit();
//			System.out.println("-----Libro actualizado------");

			// Find
//			Libro find = em.find(Libro.class, 110); // Buscamos el libro con ID 101 y lo imprimimos
//
//			System.out.println("Libro encontrado: " + find);

			} catch (Exception e) {
				System.out.println(e.getMessage());

				} finally { // Cerramos la conexion
					if (emf != null) {
						emf.close();
					}
				}

	}

}
