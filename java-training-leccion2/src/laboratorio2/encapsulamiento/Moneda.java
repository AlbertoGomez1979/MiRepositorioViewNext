package laboratorio2.encapsulamiento;

public class Moneda {
	
	private double euro;
	private double dolar;
	private double libra;
	
	
	public double getEuro() {
		return euro;
	}
	
	public void setEuro(double euro) {
		this.euro = euro;
		this.dolar = euro * 1.20;
		this.libra = euro / 2;
	}
	
	public double getDolar() {
		return dolar;
	}
	
	public void setDolar(int dolar) {
		this.dolar = dolar;
	}
	
	public double getLibra() {
		return libra;
	}
	
	public void setLibra(int libra) {
		this.libra = libra;
	}
	
	

}
