package training.lab.spring.ws.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.lab.spring.ws.rest.model.*;

/**
 * @author Emilise Navarro
 * La interfaz JpaRepository proporciona una serie de métodos CRUD 
 * (Create, Read, Update, Delete) predefinidos para la entidad Departamento. 
 * Proporciona una capa de abstracción para simplificar el acceso y la manipulación de datos en una 
 * base de datos 
 */

public interface ICuentaRepository extends JpaRepository<Cuenta, Integer> {

}
