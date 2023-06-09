package training.spring.restful.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.spring.restful.domain.Producto;

@RestController
@RequestMapping("/productos")  //Establece la url del recurso
public class ProductoResource {
	
	//Lista en memoria de los productos
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	//ruta, que es tipo GET
	@GetMapping
	public List<Producto> obtenerProductos(){
		return productos;
	}
	
	//Crear producto
		@PostMapping
		public Producto crearProducto(@RequestBody Producto producto) {
			producto.setId(System.currentTimeMillis()); //Genera ID unico basado en el tiempo
			productos.add(producto);
			return producto;
		}
	
	
	//Obtener producto por ID
	@GetMapping("/{id}")
	public Producto obtenerProductoPorId(@PathVariable Long id) {
		//recorremos los productos
		for(Producto p: productos) {
			
			if(p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}
	
	//Actualizar producto
	@PutMapping("{id}")
	public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto productoActualizado) {
		
		for(Producto p: productos) {
			
			if(p.getId().equals(id)) {
				p.setNombre(productoActualizado.getNombre());
				p.setPrecio(productoActualizado.getPrecio());
				return p;
			}
			
		}
		return null;
		
	}
	
	
	
	//Actualizar Producto


}
