package training.lab.springsoapws.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import training.lab.springsoapws.entity.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
	
	Empleado findByEmpleadoId(long empleadoId);
	
    List<Empleado> findByDepartamento(String departamento);
}
