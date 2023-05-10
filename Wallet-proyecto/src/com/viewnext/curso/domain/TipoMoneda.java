package com.viewnext.curso.domain;

public class TipoMoneda {

	private int idTipoMoneda;
	private String nombre;
	
	private Moneda moneda;//Relacion con la tabla moneda


	public TipoMoneda() {
		super();
	}
	
	

	public Moneda getMoneda() {
		return moneda;
	}



	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}



	public int getIdTipoMoneda() {
		return idTipoMoneda;
	}

	public void setIdTipoMoneda(int idTipoMoneda) {
		this.idTipoMoneda = idTipoMoneda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "TipoMoneda [idTipoMoneda=" + idTipoMoneda + ", nombre=" + nombre + "]";
	}

}
