package training.lab.hibernate.jpa.model;

import java.util.List;
import javax.persistence.*;

@Entity //Representa la tabla en la base de datos
@Table(name= "categoria") //la tabla se llama "categoria"
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre;
	
	@OneToMany()
	private List<Producto> productos;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
