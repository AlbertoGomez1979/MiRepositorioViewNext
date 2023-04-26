package training.lab.spring.ws.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import training.lab.spring.ws.rest.model.Producto;


//Para tener acceso a todas las operaciones del banco
public interface IProductoRepository extends JpaRepository<Producto, Integer>{

}
