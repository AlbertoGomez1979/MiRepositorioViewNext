package laboratorio1.herencia;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camion cm = new Camion("Powerup", "Pegaso");//Le damos los valores propios de la clase empleado al crear/instanciar el objeto
		
		//Seteamos los valores de empleado heredados de la clase padre(vehiculo)
		cm.setCombustible("Diesel");
		cm.setNumPuertas(4);
		cm.setNumruedas(18);
		
		String combustible = cm.getCombustible();
		int puertas = cm.getNumPuertas();
		int ruedas = cm.getNumruedas();
		
		System.out.println("datos del camión: ");
		System.out.println("Número de puertas: " + combustible);
		System.out.println("Número de puertas: " + puertas);
		System.out.println("Número de ruedas: " + ruedas);
		
		System.out.println(cm.getDatosCamion());//Método propio de la clase camión
		
		
		
		
		Camion cm2 = new Camion("HTT-M", "Mercedes");//Le damos los valores propios de la clase empleado al crear/instanciar el objeto
		
		//Seteamos los valores de empleado heredados de la clase padre(vehiculo)
		cm2.setCombustible("Gasolina");
		cm2.setNumPuertas(2);
		cm2.setNumruedas(30);
		
		String combustible2 =cm2.getCombustible();
		int puertas2 = cm2.getNumPuertas();
		int ruedas2 = cm2.getNumruedas();
		
		System.out.println("datos del camión 2: ");
		System.out.println("Número de puertas: " + combustible2);
		System.out.println("Número de puertas: " + puertas2);
		System.out.println("Número de ruedas: " + ruedas2);
		
		System.out.println(cm2.getDatosCamion());//Método propio de la clase camión
	}

}
