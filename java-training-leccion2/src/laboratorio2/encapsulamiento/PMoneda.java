package laboratorio2.encapsulamiento;

public class PMoneda {

	public static void main(String[] args) {
		
		Moneda moneda = new Moneda();
		moneda.setEuro(50);
		
		double eur = moneda.getEuro();
		double dol = moneda.getDolar();
		double lib = moneda.getLibra();
		
		System.out.println("Euro: " + eur);
		System.out.println("\nDolar: " + dol);
		System.out.println("\nLibra: " + lib);
	}

}
