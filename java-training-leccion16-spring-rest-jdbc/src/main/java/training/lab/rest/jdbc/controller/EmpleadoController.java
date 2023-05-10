package training.lab.rest.jdbc.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.lab.rest.jdbc.model.Empleado;
import training.lab.rest.jdbc.repository.IEmpleadoRepository;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	  @Autowired
	  IEmpleadoRepository empleadoRepository;
	  
	  /**
	   * RECOGER TODOS LOS EMPLEADOS
	   * @return
	   */
	  
	  @GetMapping("/empleados")
	  public ResponseEntity<List<Empleado>> findAll() {
	    
		  try {
	    		    	
	      List<Empleado> empleados = new ArrayList<Empleado>();
	      //Invoca el servicio findall del repositorio
	      empleadoRepository.findAll().forEach(empleados::add);
	      
	      //Si viene vacío..
	      if (empleados.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(empleados, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  
	  /**
	   * BUSQUEDA POR ID
	   * @param id
	   * @return
	   */
	  @GetMapping("/empleados/{empleado_id}")
	  public ResponseEntity<Empleado> findById(@PathVariable("empleado_id") int empleado_id) {
		  
		  Empleado empleado = empleadoRepository.findById(empleado_id);

	    if (empleado != null) {
	      return new ResponseEntity<>(empleado, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  /**
	   * CREAR EMPLEADO
	   * @param usuario
	   * @return
	   */
	  @PostMapping("/empleados")
	  public ResponseEntity<String> save(@RequestBody Empleado empleado) {
	    try {
	    	empleadoRepository.save(new Empleado(empleado.getNombre(), empleado.getApellido(), empleado.getDepartamento(), empleado.getSalario(), empleado.getEdad()));
	      return new ResponseEntity<>("Empleado creado satisfactoriamente.", HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  

	  @PutMapping("/empleados/{empleado_id}")
	  public ResponseEntity<String> update
	  (@PathVariable("empleado_id") int empleado_id, @RequestBody Empleado empleado) {
		  
		  Empleado emp = empleadoRepository.findById(empleado_id);

	    if (emp != null) {
	    	emp.setEmpleado_id(empleado_id);
	    	
	    	emp.setNombre(empleado.getNombre());
	    	emp.setApellido(empleado.getApellido());
	    	emp.setDepartamento(empleado.getDepartamento());
	    	emp.setSalario(empleado.getSalario());
	    	emp.setEdad(empleado.getEdad());

	    	empleadoRepository.update(emp);
	      return new ResponseEntity<>("Empleado actualizado satisfactoriamente.", HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>("No se encontro empleado con id= " + empleado_id, HttpStatus.NOT_FOUND);
	    }
	  }

	  @DeleteMapping("/empleados/{empleado_id}")
	  public ResponseEntity<String> deleteById(@PathVariable("empleado_id") int empleado_id) {
	    try {
	      int result = empleadoRepository.deleteById(empleado_id);
	      if (result == 0) {
	        return new ResponseEntity<>("No se encontro empleado con id=" + empleado_id, HttpStatus.OK);
	      }
	      return new ResponseEntity<>("Empleado eliminado satisfactoramente.", HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>("No se puede eliminar el empleado.", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	
}
