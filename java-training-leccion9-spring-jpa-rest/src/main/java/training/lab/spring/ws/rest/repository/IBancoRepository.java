package training.lab.spring.ws.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import training.lab.spring.ws.rest.model.Banco;



//Para tener acceso a todas las operaciones del banco
public interface IBancoRepository extends JpaRepository<Banco, Integer>{

}
