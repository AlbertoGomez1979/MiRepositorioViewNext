package training.lab.spring.ws.rest.model;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cuenta_id;
	@Column(name = "numero_cuenta")
	private long numero_cuenta;
	@Column(name="usuario")
	private String usuario;
	
	//Relacion con el banco, muchas cuentas pueden estar asociadas a un banco
	//FetchType LAZY, indica que los datos se cargaran cuando se acceda a la propiedad de banco
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "banco_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Banco banco;

	
	public Cuenta() {
	}
	
	
	public Cuenta(long numero_cuenta, String usuario) {		
		this.numero_cuenta = numero_cuenta;
		this.usuario = usuario;
		
	}


	public int getCuenta_id() {
		return cuenta_id;
	}

	public void setCuenta_id(int cuenta_id) {
		this.cuenta_id = cuenta_id;
	}

	public long getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(long numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
}
