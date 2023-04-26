package training.lab.spring.ws.rest.cotroller;
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


//para definir el controlador REST
@RestController
@RequestMapping("training/api/v1/cuentas") //Se define el path del servicio
public class CuentaController {
	
	@Autowired //Inyeccion de dependencias
	private ICuentaRepository cuentaRepository;
	
	@Autowired
	private IBancoRepository bancoRepository;
	
	@GetMapping //Define metodo para peticion GET
	public ResponseEntity<List<Cuenta>> listarCuentas(){
		return ResponseEntity.ok(cuentaRepository.findAll());
	}
	
	
	@PostMapping
	public ResponseEntity<Cuenta> guardarCuenta(@Validated @RequestBody Cuenta cuenta){
		
		Optional<Banco> bancoOptional = bancoRepository.findById(cuenta.getBanco().getBanco_id());
		
		if(!bancoOptional.isPresent()) {
			return ResponseEntity.unprocessableEntity().build();
		}
		
		cuenta.setBanco(bancoOptional.get());
		
		Cuenta cuentaCreate = cuentaRepository.save(cuenta);
		
		URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{banco_id}").buildAndExpand(cuentaCreate.getCuenta_id()).toUri();
		
		return ResponseEntity.created(ubicacion).body(cuentaCreate);
		}
	

	
	//Actualizar
	@PutMapping("/{cuenta_id}") //se le pasa el id por parametro para actualizar
	public ResponseEntity<Cuenta> actualizarCuenta(@Validated @RequestBody  Cuenta cuenta, @PathVariable Integer cuenta_id){
		
		Optional<Banco> bancoOptional = bancoRepository.findById(cuenta.getBanco().getBanco_id());
		
		
		if(!bancoOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		Optional<Cuenta> cuentaOptional = cuentaRepository.findById(cuenta_id);
		if(!cuentaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		
		cuenta.setBanco(bancoOptional.get());
		cuenta.setCuenta_id(cuentaOptional.get().getCuenta_id());
		cuentaRepository.save(cuenta);
		
		return ResponseEntity.ok().build();
		
	}
	
	
	//ELIMINAR
	@DeleteMapping("/{cuenta_id}")
	public ResponseEntity<Banco> eliminaCuenta(@PathVariable Integer cuenta_id){
		Optional<Cuenta> cuentaOptional = cuentaRepository.findById(cuenta_id);
		
		if(!cuentaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		cuentaRepository.delete(cuentaOptional.get());
		return ResponseEntity.noContent().build();
		
	}
	
	
	
	

}
