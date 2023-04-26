package training.lab.jakarta.jpa.model;

import jakarta.persistence.*;

@Entity // Representa a la tabla relacional
@Table(name = "libros") // A la tabla que representa la clase
public class Libro {

	//Anotaciones necesarias!!!!
	@Id // PK de la tabla
	@SequenceGenerator( // Con esto indicamos que el ID se genera secuencialmente y comienza en 10
			name = "libro_id_seq", sequenceName = "libro_id_seq", allocationSize = 1, initialValue = 100) 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libro_id_seq")
	private int id;
	//Columna de la tabla
	@Column
	private String nombre;
	//Columna de la tabla
	@Column
	private double precio;

	//Constructor
	public Libro(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
		
	public Libro() {
		super();
	}

	//Getter y setters y metodo toString
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	

}
