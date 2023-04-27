package training.lab.springsoapws.service;

import java.util.List;

import training.lab.springsoapws.entity.Empleado;


/**
 * @author Emilise Navarro
 * Interfaz para definir los mÃ©todos de las operaciones
 *
 */
public interface IEmpleadoService {
	List<Empleado>getAllEmpleados();
	Empleado getEmpleadoById(long empleadoId);
	boolean addEmpleado(Empleado empleado);
    void updateEmpleado(Empleado empleado);
    void deleteEmpleado(Empleado empleado);
}

