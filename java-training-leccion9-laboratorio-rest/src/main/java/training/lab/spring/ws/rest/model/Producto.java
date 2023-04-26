package training.lab.spring.ws.rest.model;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "producto_id")
	private int producto_id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="codigo")
	private int codigo;
	
	//Relacion con categoria, muchaos productos pueden estar asociadas a una categoria
		//FetchType LAZY, indica que los datos se cargaran cuando se acceda a la propiedad de banco
		@ManyToOne(fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "categoria_id")
		@JsonProperty(access = Access.WRITE_ONLY)
		private Categoria categoria;
	
	
	//Constructor
	public Producto() {
	}

	//Getter y Setters

	public int getProducto_id() {
		return producto_id;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [producto_id=" + producto_id + ", nombre=" + nombre + ", precio=" + precio + ", categoria="
				+ categoria + "]";
	}

	




}
