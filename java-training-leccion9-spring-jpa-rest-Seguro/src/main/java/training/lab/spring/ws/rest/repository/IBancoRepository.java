package training.lab.spring.ws.rest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import training.lab.spring.ws.rest.model.Banco;


/**
 * @author Emilise Navarro
 * La interfaz JpaRepository proporciona una serie de métodos CRUD 
 * (Create, Read, Update, Delete) predefinidos para la entidad Empleado. 
 * Proporciona una capa de abstracción para simplificar el acceso y la manipulación de datos en una 
 * base de datos
 * Se puede utilizar para ejecutar las operaciones directamente, pero para buenas practicas es mejor 
 * crear la clase Service y definir las operaciones 
 */
public interface IBancoRepository extends JpaRepository<Banco, Integer> {

}
