package training.lab2.encapsulamiento;

public class Termometro {

	private double celsius;
	private double fahrenheit;
	private double kelvin;
	
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
		this.fahrenheit = (celsius * 1.8) + 32; //valores para fahrenheit y kelvin, encapsulamiento
		this.kelvin = celsius + 273.15;
	}
	
	public double getFahrenheit() {
		return fahrenheit;
	}
	
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public double getKelvin() {
		return kelvin;
	}
	
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
	
	
}
