package training.lab2.objeto;

public class Modelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creando objeto a partir del constructor sin parametros
		Coche rio = new Coche();
		rio.color = "Rojo";
		rio.Velocidad = "200 km/h";
		//le damos valor a todos los atributos
		
		//Llamamos al método arrancar
		rio.arrancar();
		
		System.out.println("El color del coche rio es " + rio.color);
		
		//Objeto creado a partir del constructor con parametros
		Coche supra = new Coche(null, null, null, null, null, null);
		supra.color = "Gris";
		supra.Velocidad = "250km/h";
		//Introducimos todos los atributos
		
		supra.arrancar();
		
		System.out.println("el color del coche supra es " + supra.color);

	}

}
