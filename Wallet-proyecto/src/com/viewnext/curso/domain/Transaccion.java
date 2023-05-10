package com.viewnext.curso.domain;

public class Transaccion {

	//ATRIBUTOS PROPIOS
	private int idTransaccion;
	private int referencia;
	private double monto;
	private String concepto;
	private String fecha;
	private String canal;
	
	//ATRIBUTOS PARA RELACIONES CON LAS TABLAS(CLASES)
	private int idWallet;
	private int idEstatus;
	private int idTipoMoneda;



	public Transaccion() {
		super();
	}
	
	

	public int getIdWallet() {
		return idWallet;
	}



	public void setIdWallet(int idWallet) {
		this.idWallet = idWallet;
	}



	public int getIdEstatus() {
		return idEstatus;
	}



	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}



	public int getIdTipoMoneda() {
		return idTipoMoneda;
	}



	public void setIdTipoMoneda(int idTipoMoneda) {
		this.idTipoMoneda = idTipoMoneda;
	}



	public int getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	@Override
	public String toString() {
		return "Transaccion [idTransaccion=" + idTransaccion + ", referencia=" + referencia + ", monto=" + monto
				+ ", concepto=" + concepto + ", fecha=" + fecha + ", canal=" + canal + "]";
	}

}
