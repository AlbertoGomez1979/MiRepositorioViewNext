package training.lab.hibernate.jpa.model;

import javax.persistence.*;
//Para asignar la clave foranea de la tabla, no creo que sea muy necesario ?¿
@SuppressWarnings("deprecation")//Por la clave foranea 
@org.hibernate.annotations.ForeignKey(name = "fk_categoria")

@Entity //Representa a la tabla de datos relacional
@Table(name = "productos") //Tabla que representa a la entidad
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Indica la PK de la tabla
	private long id;
	@Column //Indica que el atributo es una columna
	private String nombre;
	@Column
	private double precio;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idCategoria")//Relacion con la tabla categoria, seria el fk de Producto referida a Categoria
	private Categoria categoria;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
