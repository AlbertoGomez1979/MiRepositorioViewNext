package training.lab2.encapsulamiento;

public class Termo {
	
	public static void main(String[] args) {
	
	Termometro termo = new Termometro();
	termo.setCelsius(92.0);
	
	//modificamos el valor de celsius
	double far = termo.getFahrenheit();
	double cel = termo.getCelsius();
	double kel = termo.getKelvin();
	
	System.out.println("Fahrenheigt: " + far);
	System.out.println("\nCelsius: " + cel);
	System.out.println("\nkelvin: " + kel);
	
	}

}
