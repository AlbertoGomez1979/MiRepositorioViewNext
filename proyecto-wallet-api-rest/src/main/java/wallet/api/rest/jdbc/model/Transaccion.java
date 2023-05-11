package wallet.api.rest.jdbc.model;

public class Transaccion {

	//ATRIBUTOS PROPIOS
	private int idtransaccion;
	//ATRIBUTOS PARA RELACIONES CON LAS TABLAS(CLASES)
	private int wallet_idwallet;
	private int estatusTransaccion_idestatusTransaccion;
	private int tipoTransaccion_idtipoTransaccion;
	
	private int referencia;
	private double monto;
	private String concepto;
	private String fecha;
	private String canal;
	private String adreesdestino;
	

	public Transaccion() {
		super();
	}
	
	public Transaccion(int idWallet, int idEstatus, int idTipoTransaccion, int referencia, double monto, String concepto, String fecha, String canal,
			String adressDestino) {
		super();
		
		this.wallet_idwallet = idWallet;
		this.estatusTransaccion_idestatusTransaccion = idEstatus;
		this.tipoTransaccion_idtipoTransaccion= idTipoTransaccion;
		this.referencia = referencia;
		this.monto = monto;
		this.concepto = concepto;
		this.fecha = fecha;
		this.canal = canal;
		this.adreesdestino = adressDestino;
	}

	public int getIdtransaccion() {
		return idtransaccion;
	}

	public void setIdtransaccion(int idtransaccion) {
		this.idtransaccion = idtransaccion;
	}

	public int getWallet_idwallet() {
		return wallet_idwallet;
	}

	public void setWallet_idwallet(int wallet_idwallet) {
		this.wallet_idwallet = wallet_idwallet;
	}

	public int getEstatusTransaccion_idestatusTransaccion() {
		return estatusTransaccion_idestatusTransaccion;
	}

	public void setEstatusTransaccion_idestatusTransaccion(int estatusTransaccion_idestatusTransaccion) {
		this.estatusTransaccion_idestatusTransaccion = estatusTransaccion_idestatusTransaccion;
	}

	public int getTipoTransaccion_idtipoTransaccion() {
		return tipoTransaccion_idtipoTransaccion;
	}

	public void setTipoTransaccion_idtipoTransaccion(int tipoTransaccion_idtipoTransaccion) {
		this.tipoTransaccion_idtipoTransaccion = tipoTransaccion_idtipoTransaccion;
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

	public String getAdreesdestino() {
		return adreesdestino;
	}

	public void setAdreesdestino(String adreesdestino) {
		this.adreesdestino = adreesdestino;
	}

	

}
