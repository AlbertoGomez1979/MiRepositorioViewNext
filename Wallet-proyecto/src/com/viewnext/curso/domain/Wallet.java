package com.viewnext.curso.domain;

import java.util.List;

public class Wallet {

	private int idWallet;
	private String code, address;
	private double balance;
	
	
	//Relaciones con otras tablas
	private List<Transaccion> transaccion; //una wallet puede tener muchas transacciones
	private Moneda moneda; //Relacion 1 a 1 con la tabla moneda.
	private int idUsuario; //un usuario puede tener muchas wallet
	

	public Wallet() {
		super();
	}
	
	
	

	public int getIdUsuario() {
		return idUsuario;
	}




	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}




	public Moneda getMoneda() {
		return moneda;
	}




	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
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
