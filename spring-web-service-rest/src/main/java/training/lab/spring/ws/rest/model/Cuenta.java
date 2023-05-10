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
	@Column(name="numero_cuenta")
	private Long  numero_cuenta;
	@Column(name="usuario")
	private String usuario;
	
	/*  
	 * @ManyToOne aqui la relación es bidireccional quiere decir que Mucha Cuentas,
	 * están relacionadas a un banco.
	 * FetchType.LAZY. Esto significa que los datos de la relación entre Banco y Cuenta 
	 * solo se cargarán cuando se acceda a la propiedad banco.
	*/
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "banco_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Banco banco;
	
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Cuenta(Long numero_cuenta, String usuario, int id_bank) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.usuario = usuario;
	}


	public int getCuenta_id() {
		return cuenta_id;
	}
	public void setCuenta_id(int cuenta_id) {
		this.cuenta_id = cuenta_id;
	}
	public Long getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(Long numero_cuenta) {
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


	@Override
	public String toString() {
		return "Cuenta [cuenta_id=" + cuenta_id + ", numero_cuenta=" + numero_cuenta + ", usuario=" + usuario
				+ ", banco=" + banco + "]";
	}

	
}
