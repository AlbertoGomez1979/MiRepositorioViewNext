package com.app.model;

import java.util.List;

public class Wallet {

	private int idWallet;
	private int moneda_idmoneda;
	private int usuario_idusuario;
	private String code;
	private double balance;
	private String address;
	


	public int getIdWallet() {
		return idWallet;
	}
	
	public void setIdWallet(int idWallet) {
		this.idWallet = idWallet;
	}
	
	public int getMoneda_idmoneda() {
		return moneda_idmoneda;
	}
	
	public void setMoneda_idmoneda(int moneda_idmoneda) {
		this.moneda_idmoneda = moneda_idmoneda;
	}
	
	public int getUsuario_idusuario() {
		return usuario_idusuario;
	}
	
	public void setUsuario_idusuario(int usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
		

}
