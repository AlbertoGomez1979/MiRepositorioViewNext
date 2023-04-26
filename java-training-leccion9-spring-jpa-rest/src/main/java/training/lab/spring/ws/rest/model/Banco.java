package training.lab.spring.ws.rest.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "banco")
public class Banco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "banco_id")
	private int banco_id;
	
	@Column(name="nombre")
	private String nombre;
	
	//Relacion, Un Banco puede tener muchas cuentas.
	//Cascade all, indica que al eliminar un banco, se eliminan todas las cuentas asociadas
	@OneToMany(mappedBy = "banco", cascade = CascadeType.ALL)
	private Set<Cuenta> cuentas = new HashSet<>();
	
	
	//Constructor
	public Banco() {
	}

	//Getter y Setters
	public int getBanco_id() {
		return banco_id;
	}

	public void setBanco_id(int banco_id) {
		this.banco_id = banco_id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Cuenta> getCuentas() {
		return cuentas;
	}


	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
		
		for(Cuenta cuenta: cuentas) {
			cuenta.setBanco(this);
		}
		
	}


	
	@Override
	public String toString() {
		return "Banco [banco_id=" + banco_id + ", nombre=" + nombre + "]";
	}

	


}
