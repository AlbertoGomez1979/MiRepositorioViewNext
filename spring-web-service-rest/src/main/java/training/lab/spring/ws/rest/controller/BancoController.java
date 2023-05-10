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

import training.lab.spring.ws.rest.model.Banco;
import training.lab.spring.ws.rest.repository.IBancoRepository;

@RestController
@RequestMapping("training/api/v1/banco")
public class BancoController {
	
	@Autowired
	private IBancoRepository bancoRepository;
	
	@GetMapping
	public ResponseEntity<List<Banco>> listarBancos(){
		return ResponseEntity.ok(bancoRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Banco> guardarBanco(@Validated @RequestBody Banco Banco){
		Banco bancoCreate = bancoRepository.save(Banco);
		URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(bancoCreate.getBanco_id()).toUri();
		return ResponseEntity.created(ubicacion).body(bancoCreate);
	}
	
	@PutMapping("/{banco_id}")
	public ResponseEntity<Banco> actualizarBanco(@PathVariable Integer banco_id,@Validated @RequestBody Banco Banco){
		Optional<Banco> bancoOptional = bancoRepository.findById(banco_id);
		
		if(!bancoOptional.isPresent()){
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		Banco.setBanco_id(bancoOptional.get().getBanco_id());
		bancoRepository.save(Banco);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{banco_id}")
	public ResponseEntity<Banco> eliminarBanco(@PathVariable Integer banco_id){
		Optional<Banco> BancoOptional = bancoRepository.findById(banco_id);
		
		if(!BancoOptional.isPresent()){
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		bancoRepository.delete(BancoOptional.get());
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{banco_id}")
	public ResponseEntity<Banco> obtenerBancoPorId(@PathVariable Integer banco_id){
		Optional<Banco> BancoOptional = bancoRepository.findById(banco_id);
		
		if(!BancoOptional.isPresent()){
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		return ResponseEntity.ok(BancoOptional.get());
	}
	

}
