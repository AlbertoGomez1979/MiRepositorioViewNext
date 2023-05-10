package training.lab.rest.jdbc.repository;

import java.util.List;

import training.lab.rest.jdbc.model.Empleado;

public interface IEmpleadoRepository {
	
	int save(Empleado emp);
	
	int update(Empleado emp);
	
	Empleado findById(int id);
	
	int deleteById(int id);
	
	List<Empleado> findAll();

}
