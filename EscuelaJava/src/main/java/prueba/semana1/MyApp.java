package prueba.semana1;

import javax.persistence.EntityManager;

import prueba.semana1.jpa.persistence.JpaPersistence;
import prueba.semana1.model.Coche;

/**
 * MyApp.java
 *
 * @autor: Antonio Garces
 * @revisor: Carlos Arranz
 * @version: 1.0
 */
public class MyApp {

    /**
     * Pide al usuario que seleccione un vehiculo y una accion.
     *
     * @param args linea de comandos
     */
    public static void main(String[] args) {

    	//EntityManager entity = JpaPersistence.getEntityManagerfactory().createEntityManager();
    	//Coche coche = new Coche("Rojo", "Toyota", "20.000 €", "SADF12", "Manual");      
    	
    	
        VehiculoManager vehiculoManager = new VehiculoManager();
        vehiculoManager.createVehiculo();
        
//        entity.getTransaction().begin(); //Inicia transacción
//       	entity.persist(coche); //guarda en base de datos
//		entity.getTransaction().commit(); //Aquí termina guardando todos los cambios
		
        while (!vehiculoManager.runAccion()) {
        }

    }

}
