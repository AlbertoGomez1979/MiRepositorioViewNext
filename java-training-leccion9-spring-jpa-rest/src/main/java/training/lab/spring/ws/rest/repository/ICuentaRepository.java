package training.lab.spring.ws.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import training.lab.spring.ws.rest.model.*;

//Este repositorio tiene acceso para realizar un CRUD
public interface ICuentaRepository extends JpaRepository<Cuenta, Integer>{

}
