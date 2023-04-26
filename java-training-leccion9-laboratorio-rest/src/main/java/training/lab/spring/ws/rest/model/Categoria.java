package training.lab.spring.ws.rest.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categoria_id")
	private int categoria_id;
	
	@Column(name = "nombre")
	private String nombre;	

	//Relacion, Una categoria puede tener muchos productos
		//Cascade all, indica que al eliminar una categoria, se eliminan todas los productos
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		private Set<Producto> productos = new HashSet<>();
	
				
	public Categoria() {
	}
	
	
	//Getter y setters
	public int getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
		
		for(Producto p : productos) {
			p.setCategoria(this);
		}
	}
	
	


	
}
