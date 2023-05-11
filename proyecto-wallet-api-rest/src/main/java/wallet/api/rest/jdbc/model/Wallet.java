package wallet.api.rest.jdbc.model;

import java.util.List;

public class Wallet {

	private int idWallet;
	
	private int moneda_idmoneda;
	private int usuario_idusuario; //un usuario puede tener muchas wallet
	private String code;
	private double balance;
	private String address;
		
	//Relaciones con otras tablas
	private List<Transaccion> transaccion; //una wallet puede tener muchas transacciones
	//private Moneda moneda; //Relacion 1 a 1 con la tabla moneda.
	
	
	

	public Wallet() {
		super();
	}
	
	public Wallet(int moneda_idmoneda, int idUsuario, String code, double balance, String address
			) {
		super();
		this.code = code;
		this.address = address;
		this.balance = balance;
		//this.transaccion = transaccion;
		this.usuario_idusuario = idUsuario;
		this.moneda_idmoneda = moneda_idmoneda;
	}



	/*
	 * public Moneda getMoneda() { return moneda; }
	 

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	*/

	public int getUsuario_idusuario() {
		return usuario_idusuario;
	}

	public void setUsuario_idusuario(int usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}

	public int getMoneda_idmoneda() {
		return moneda_idmoneda;
	}

	public void setMoneda_idmoneda(int moneda_idmoneda) {
		this.moneda_idmoneda = moneda_idmoneda;
	}

	public List<Transaccion> getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}

	public int getIdWallet() {
		return idWallet;
	}


	public void setIdWallet(int idWallet) {
		this.idWallet = idWallet;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
