package desafio;

import java.util.ArrayList;
import java.util.List;


public class Wallet2 {
	
	List<Currency> currencies;
	
	public Wallet2() {
		currencies = new ArrayList<>();
	}
	
	public void addCurrency(Currency currency, double amount) {
		currency.setAmount(currency.getAmount() + amount);
	}
	
	public void removeCurrency(Currency currency, double amount) {
		currency.setAmount(currency.getAmount() - amount);
	}
	

}

class Currency{
	private String nombre;
	private double amount;

	public Currency(String nombre, double amount) {
		super();
		this.nombre = nombre;
		this.amount = amount;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
	
	
	
	
}
