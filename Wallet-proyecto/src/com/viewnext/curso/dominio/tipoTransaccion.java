package com.viewnext.curso.dominio;

import java.util.List;

public class tipoTransaccion {

	private int idTipoTransaccion;
	private String nombre;
	
	private List<Transaccion> transaccion;//Relacion con otras tablas, con la tabla transaccion, un tipo de transaccion puede tener varias transacciones



	public tipoTransaccion() {
		super();
	}
	
	

	public List<Transaccion> getTransaccion() {
		return transaccion;
	}



	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}


	public int getIdTipoTransaccion() {
		return idTipoTransaccion;
	}

	public void setIdTipoTransaccion(int idTipoTransaccion) {
		this.idTipoTransaccion = idTipoTransaccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "tipoTransaccion [idTipoTransaccion=" + idTipoTransaccion + ", nombre=" + nombre + "]";
	}

}
