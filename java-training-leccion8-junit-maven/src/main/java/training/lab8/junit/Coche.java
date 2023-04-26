package training.lab8.junit;

public class Coche {
	
	public String modelo;
	public float precioBase;
	public static float impuesto; //Porcentaje entre 0 y 100
	
	public Coche(String modelo, float precioBase) {
		this.modelo = modelo;
		this.precioBase = precioBase;
	}
	
	//Método para calcular el precio final, el descuento se da si el precio es mayor a 5000
	public float precioFinal(float descuento) throws Exception{
		
		float precioConDescuento = this.precioBase;
		
		System.out.println("Esto es el precio que llega de precio base: " + precioBase);
		
		if(descuento < 0 || descuento > 100){ //Descuento entre 0 y 100
			throw new RuntimeException("descuento erroneo");
		}
		
		if(precioBase >= 5000) { //Si es mayor de 5000, se calcula el descuento
			System.out.println("-----Condicion de descuento------");
			System.out.println("DEscuento: " + descuento);
			precioConDescuento = this.precioBase - (this.precioBase*descuento/100f);
			System.out.println("Precio con descuento: " + precioConDescuento);	
		}
			//Se calcula el precio final
			return precioConDescuento + precioConDescuento * Coche.impuesto/100f; 
	}
}
		
