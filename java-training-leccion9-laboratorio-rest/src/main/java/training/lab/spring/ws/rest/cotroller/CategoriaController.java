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

import training.lab.spring.ws.rest.model.Categoria;
import training.lab.spring.ws.rest.repository.ICategoriaRepository;


@RestController
@RequestMapping("training/api/v1/categoria") //Ruta base
public class CategoriaController {
	
	//Inyecta todos los metodos de la clase repository
	@Autowired
	private ICategoriaRepository categoriaRepository;
	
	
	//LISTAR CATEGORIA
	@GetMapping
	public ResponseEntity<List<Categoria>> listarcategorias() {
		return ResponseEntity.ok(categoriaRepository.findAll()); //Para usar el metodo findAll
		}
	
	
	//GUARDAR
	@PostMapping
	public ResponseEntity<Categoria> guardarCategoria(@Validated @RequestBody Categoria Categoria){
		Categoria categoriaCreate = categoriaRepository.save(Categoria);
		URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(categoriaCreate.getCategoria_id()).toUri();
		
		return ResponseEntity.created(ubicacion).body(categoriaCreate);
		
	}
	
	
	//ACTUALIZAR
	@PutMapping("/{categoria_id}") //Se concatena a la ruta base
	public ResponseEntity<Categoria> actualizarCategoria(@PathVariable Integer categoria_id, @Validated @RequestBody Categoria Categoria){
		Optional<Categoria> categoriaOptional = categoriaRepository.findById(categoria_id);
		
		if(!categoriaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		Categoria.setCategoria_id(categoriaOptional.get().getCategoria_id());
		categoriaRepository.save(Categoria);  //Se setean los valores del banco encontrado
		
		return ResponseEntity.noContent().build();		
	}
	
	
	//ELIMINAR
	@DeleteMapping("/{categoria_id}")
	public ResponseEntity<Categoria> eliminarCategoria(@PathVariable Integer categoria_id){
		Optional<Categoria>categoriaOptional = categoriaRepository.findById(categoria_id);
		
		if(!categoriaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		categoriaRepository.delete(categoriaOptional.get());
		return ResponseEntity.noContent().build();
		
	}
	
	
	//OBTENER POR ID
	@GetMapping("/{categoria_id}")
	public ResponseEntity<Categoria> obtenerCategoriaPorId(@PathVariable Integer categoria_id){
		Optional<Categoria> categoriaOptional = categoriaRepository.findById(categoria_id);
		
		if(!categoriaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		return ResponseEntity.ok(categoriaOptional.get());
		
	}
	

}
