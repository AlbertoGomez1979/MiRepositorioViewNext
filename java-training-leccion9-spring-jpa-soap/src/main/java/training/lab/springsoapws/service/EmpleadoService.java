package training.lab.springsoapws.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.lab.springsoapws.entity.Empleado;
import training.lab.springsoapws.repository.EmpleadoRepository;



/**
 * @author Emilise Navarro
 * La anotaciÃ³n @Service se utiliza para marcar una clase de servicio en la capa de negocio de 
 * una aplicaciÃ³n Spring. Se utiliza para cargar las operaciones
 * El constructor de la clase utiliza la anotaciÃ³n @Autowired para inyectar la dependencia
 *
 */
@Service
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> getAllEmpleados() {
		List<Empleado> list = new ArrayList<>();
		empleadoRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Empleado getEmpleadoById(long empleadoId) {
		Empleado obj = empleadoRepository.findByEmpleadoId(empleadoId);
		return obj;
	}

	@Override
	public synchronized boolean addEmpleado(Empleado empleado) {
		 List<Empleado> list = empleadoRepository.findByDepartamento(empleado.getDepartamento()); 	
         if (list.size() > 0) {
	           return false;
         } else {
        	 empleado = empleadoRepository.save(empleado);
	           return true;
         }
	}

	@Override
	public void updateEmpleado(Empleado empleado) {
		empleadoRepository.save(empleado);
		
	}

	@Override
	public void deleteEmpleado(Empleado empleado) {
		empleadoRepository.delete(empleado);
		
	}

}

