package training.lab.spring.ws.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import training.lab.spring.ws.rest.model.Categoria;



//Este repositorio tiene acceso para realizar un CRUD
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{

}
