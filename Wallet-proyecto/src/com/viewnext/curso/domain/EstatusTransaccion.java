package com.viewnext.curso.dominio;

import java.util.List;

public class EstatusTransaccion {
	
	private int idEstatus;
	private String nombre;
	//RELACIONES CON OTRAS TABLAS
	private List<Transaccion> transaccion; //Un estatus puede tener muchas transacciones
	
	
		

	public EstatusTransaccion() {
		super();
	}
	
	public List<Transaccion> getTransaccion() {
		return transaccion;
	}


	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}



	public int getIdEstatus() {
		return idEstatus;
	}


	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "EstatusTransaccion [idEstatus=" + idEstatus + ", nombre=" + nombre + "]";
	}
	
	
	

}
