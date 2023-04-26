package training.laboratorio;

import jakarta.persistence.*;


public class UsuarioApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("laboratorio"); //TOma el nombre de persistence.xml
			em = emf.createEntityManager();

			Usuario u1 = new Usuario("Alberto", "AlbertoG", "pass", "alberto@alberto.com", "30/02/2022");
			Usuario u2 = new Usuario("Alberto", "AlbertoG", "pass", "alberto@alberto.com", "30/02/2022");
			Usuario u3 = new Usuario("Alberto", "AlbertoG", "pass", "alberto@alberto.com", "30/02/2022");
			
			 //Insertando
			em.getTransaction().begin();
			// Persiste el objeto
			em.persist(u1);
			em.persist(u2);
			em.persist(u3);
			// Hacemos el commit para guardarlo
			em.getTransaction().commit();
			System.out.println("------Usuario insertado con persist!!!!!!!----");

			
			// Update
//			em.getTransaction().begin();
//			Usuario selected = em.find(Usuario.class, 52); // Buscamos el ID
//			System.out.println(selected);
//			selected.setNombre("Cambio de nombre");
//			em.persist(selected);
//			em.getTransaction().commit();
//			System.out.println("-----Usuario actualizado------");

			
			// Find
//			Usuario find = em.find(Usuario.class, 52); // Buscamos el libro con ID 101 y lo imprimimos
//			System.out.println("-------Usuario encontrado: " + find + " -----------");
			

			// Borrado
//			em.getTransaction().begin(); // Inicio de la transaccion
//			
//			Usuario b = em.find(Usuario.class, 51);//Mostrar usuario que se va a borrar
//			System.out.println(b);
//			
//			em.remove(b);//Borramos contenido en la variable "b"
//			em.getTransaction().commit();
//			System.out.println("-------Usuario Borrado------");
			

			} catch (Exception e) {
				System.out.println(e.getMessage());

				} finally { // Cerramos la conexion
					if (emf != null) {
						emf.close();
					}
				}

	}
		
}


