package com.viewnext.curso.dominio;

public class Moneda {

	private int idMoneda;
	private String nombre;
	//RELACION CON OTRAS TABLAS
	private int idWallet;
	private int idTipoMoneda;


	public Moneda() {
		super();
	}
	
	

	public int getIdWallet() {
		return idWallet;
	}



	public void setIdWallet(int idWallet) {
		this.idWallet = idWallet;
	}



	public int getIdTipoMoneda() {
		return idTipoMoneda;
	}



	public void setIdTipoMoneda(int idTipoMoneda) {
		this.idTipoMoneda = idTipoMoneda;
	}



	public int getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(int idMoneda) {
		this.idMoneda = idMoneda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Moneda [idMoneda=" + idMoneda + ", nombre=" + nombre + "]";
	}

}
