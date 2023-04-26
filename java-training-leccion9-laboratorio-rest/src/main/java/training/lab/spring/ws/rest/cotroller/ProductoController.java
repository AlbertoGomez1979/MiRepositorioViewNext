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



@RestController
@RequestMapping("training/api/v1/producto") //Ruta base
public class ProductoController {
	
	//Inyecta todos los metodos de la clase repository
	@Autowired
	private IProductoRepository productoRepository;
	
	//Inyecta todos los metodos de la clase repository
		@Autowired
		private ICategoriaRepository categoriaRepository;
		
	
	
	//LISTAR BANCO
	@GetMapping
	public ResponseEntity<List<Producto>> listarProductos() {
		return ResponseEntity.ok(productoRepository.findAll()); //Para usar el metodo findAll
		}
	
	
	//GUARDAR
	@PostMapping
	public ResponseEntity<Producto> guardarproducto(@Validated @RequestBody Producto Producto){
		Optional<Categoria> optinalCategoria = categoriaRepository.findById(Producto.getCategoria().getCategoria_id());
		
		if(!optinalCategoria.isPresent()) {
			return ResponseEntity.unprocessableEntity().build();
			}
		Producto.setCategoria(optinalCategoria.get());
		
		Producto productoCreate = productoRepository.save(Producto);
		URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(productoCreate.getProducto_id()).toUri();
		
		return ResponseEntity.created(ubicacion).body(productoCreate);
		
	}
	
	
	//ACTUALIZAR
	@PutMapping("/{producto_id}") //Se concatena a la ruta base
	public ResponseEntity<Producto> actualizarProducto(@PathVariable Integer producto_id, @Validated @RequestBody Producto Producto){
		
		//En producto tiene que aparecer una categoria
		Optional<Categoria> optinalCategoria = categoriaRepository.findById(Producto.getCategoria().getCategoria_id());		
		if(!optinalCategoria.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
			}
		
		Optional<Producto> productoOptional = productoRepository.findById(producto_id);		
		if(!productoOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		//Le pasamos la categoria
		Producto.setCategoria(optinalCategoria.get());
		Producto.setProducto_id(productoOptional.get().getProducto_id());
		productoRepository.save(Producto);  //Se setean los valores del banco encontrado
		
		return ResponseEntity.noContent().build();		
	}
	
	
	//ELIMINAR
	@DeleteMapping("/{producto_id}")
	public ResponseEntity<Producto> eliminarproducto(@PathVariable Integer producto_id){
		Optional<Producto> productoOptional = productoRepository.findById(producto_id);
		
		if(!productoOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		
		productoRepository.delete(productoOptional.get());
		return ResponseEntity.noContent().build();
		
	}
	
	
	//OBTENER POR ID
	@GetMapping("/{producto_id}")
	public ResponseEntity<Producto> obtenerProductoPorId(@PathVariable Integer producto_id){
		Optional<Producto> productoOptional = productoRepository.findById(producto_id);
		
		if(!productoOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		return ResponseEntity.ok(productoOptional.get());
		
	}
	

}
