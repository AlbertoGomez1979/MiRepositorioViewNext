package training.lab1;



public class Laboratorio2 {
	
	public static void main(String[] args) {
		
		//Supongamos que el usuario ingresa el número 6 y el siguiente arreglo:
		//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		//El programa debe realizar una búsqueda binaria en el arreglo y encontrar el índice del número 6
		
		int indice = 6;
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == indice) {
				System.out.println("Número en posición: " + i);
			}
		}
		
	}

}
