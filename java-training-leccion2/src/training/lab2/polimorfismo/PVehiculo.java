package training.lab2.polimorfismo;


//Clase de prueba
public class PVehiculo {

	public static void main(String[] args) {
		
		Vehiculo nVehiculos[] = new Vehiculo[4];  //Array de vehículos
		
		nVehiculos[0] = new Vehiculo("GT", "Yamaha Moto", "Deportiva");
		nVehiculos[1] = new VPeugeot("GTI", "3008", "Turismo", 4); //polimorfismo
		nVehiculos[2] = new VMaserati("ATT1", "Guilly", "Deportivo", 3000);
		nVehiculos[3] = new Vhyundai("TDI", "Tucson", "Turismo", 500);
		
		for(Vehiculo vehiculos: nVehiculos) {
			
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
		
	}

}
