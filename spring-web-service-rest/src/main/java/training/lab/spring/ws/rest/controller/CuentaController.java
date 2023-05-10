package training.lab.spring.ws.rest.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import training.lab.spring.ws.rest.model.*;
import training.lab.spring.ws.rest.repository.*;

/* @RestController anotación que se utiliza para definir un controlador REST.
 * Cuando se utiliza @RestController, Spring considera que todas las operaciones 
 * de este controlador deben devolver datos en formato JSON
 * */
@RestController
@RequestMapping("training/api/v1/cuenta")//Se define el path del servicio
public class CuentaController {
    
	@Autowired //se utiliza para la inyección de dependencias 
	private ICuentaRepository cuentaRepository; //intancias de los repositorios
	@Autowired
	private IBancoRepository bancoRepository;
	
	
    
	@GetMapping //define método para la peticién GET
	public ResponseEntity<List<Cuenta>> listarCuentas(){
		return ResponseEntity.ok(cuentaRepository.findAll());
	}

    @PostMapping //define método para la peticién POST
	/* 
	 * ResponseEntity se utiliza para representar una respuesta HTTP que 
	 * contiene un cuerpo, encabezados y código de estado. 
	 * A través del objeto bancoRepository y cuentaRepository se pueden definir 
	 * las operaciones.
	 * 
	 * */
    
	//Definición de métodos para ejecutar las operaciones de acceso a datos proporcionadas
	//por los Repositorios findAll, sava, findById, delete
	public ResponseEntity<Cuenta> guardarCuenta(@Validated @RequestBody Cuenta cuenta) {
		Optional<Banco> bancoOptional = bancoRepository.findById(cuenta.getBanco().getBanco_id());
		if(!bancoOptional.isPresent()){
			return ResponseEntity.unprocessableEntity().build();
		}
		cuenta.setBanco(bancoOptional.get());
		Cuenta cuentaCreate= cuentaRepository.save(cuenta);
		URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{banco_id}")
				.buildAndExpand(cuentaCreate.getCuenta_id()).toUri();
				return ResponseEntity.created(ubicacion).body(cuentaCreate);		
	}
	
	
	@PutMapping("/{cuenta_id}") //define método para la peticién PUT
	public ResponseEntity<Cuenta> actualizarCuenta(@Validated @RequestBody Cuenta cuenta,@PathVariable Integer cuenta_id){
		Optional<Banco> bancoOptional = bancoRepository.findById(cuenta.getBanco().getBanco_id());
		
		if(!bancoOptional.isPresent()){
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		Optional<Cuenta> cuentaOptional = cuentaRepository.findById(cuenta_id);
		
		if(!cuentaOptional.isPresent()){
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		cuenta.setBanco(bancoOptional.get());
		cuenta.setCuenta_id(cuentaOptional.get().getCuenta_id());
		cuentaRepository.save(cuenta);
		
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{cuenta_id}") //define método para la peticién DELETE
	public ResponseEntity<Cuenta> eliminarCuenta(@PathVariable Integer cuenta_id){
		Optional<Cuenta> cuentaOptional = cuentaRepository.findById(cuenta_id);
		
		if(!cuentaOptional.isPresent()){
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		cuentaRepository.delete(cuentaOptional.get());
		return ResponseEntity.ok().build();
	}
	
	/**
	 * @param cuenta_id
	 * @return
	 */
	@GetMapping("/{cuenta_id}")//define método para la peticién GET BY ID
	public Optional<Cuenta> obtenerCuentaPorId(@PathVariable Integer cuenta_id){
		/*
		 * Optional<Cuenta> cuentaOptional = cuentaRepository.findById(cuenta_id);
		 * 
		 * if(!cuentaOptional.isPresent()){ return
		 * ResponseEntity.status(HttpStatus.NO_CONTENT).build(); }
		 */
		
		return cuentaRepository.findById(cuenta_id);
	}

}
