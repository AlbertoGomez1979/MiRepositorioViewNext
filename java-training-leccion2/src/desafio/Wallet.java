package desafio;

public class Wallet {
	
	private String nombre;
	private String numeroCuenta;
	private double cantidad;
	private String cripto;
	
	
	public Wallet(String nombre, String numeroCuenta, double cantidad, String cripto) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.cantidad = cantidad;
		this.cripto = cripto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	
	@Override
	public String toString() {
		return "Wallet nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", cantidad=" + cantidad + ", cripto="
				+ cripto;
	}


	public void addCurrency(String currency, double amount) {
		
		if(currency==cripto && amount<= 0) {
			cantidad += amount;
			System.out.println("Se ha hecho el ingreso de : " +amount + " en " + currency);
			
		}else {
			System.out.println("No tienes :" + currency);
		}
		
	}
	
	public void removeCurrency(String currency, double amount) {
		
		if(currency==cripto && cantidad>amount) {
			cantidad -= amount;
			System.out.println("Se ha hecho retirado " + cantidad + " en: " + currency);
			
		}else {
			System.out.println("Hay algún error!!");
		}
		
	}
	
	public double getBalance(String currency) {
		
		return cantidad;
	}
	
	
	public void sendCurrency(String currency, double amount, String address) {		
		
		
			
		
	}
	
	

}
