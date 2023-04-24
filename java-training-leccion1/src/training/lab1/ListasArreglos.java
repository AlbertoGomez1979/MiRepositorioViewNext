package training.lab1;

import java.util.Arrays;

public class ListasArreglos {

	public static void main(String[] args) {
		
		//Métodos de Array
		int[] arr1 = {0,2,4,6,8,10};
		int[] arr2 = {0,2,4,6,8,10};
		int[] arr3 = {10,8,6,4,2,0};
		
		//Metodo equals, comparando arrays
		boolean result1 = Arrays.equals(arr1, arr2);
		boolean result2 = Arrays.equals(arr1, arr3);
		
		//Mostrando resultados
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		
		
		//Copiar un array en otro... copyOfRange
		//Array de origen
		int[] source = {12, 1, 5, -8, 20, 52, 22, 87, 99, 45, 35, 78};
		//Array de destino
		int[] dest = Arrays.copyOfRange(source, 3, 7);
		
		System.out.println("Destino " + dest[0]);
		System.out.println("Destino " + dest[1]);
		System.out.println("Destino " + dest[2]);
		System.out.println("Destino " + dest[3]);
		
		
		//Metodo toString()
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(numbers));
		
		
		//Método sort() Ordena un array
		int[] numbers2 = {12, 1, 5, -2, 16, 14};
		Arrays.sort(numbers2);
		System.out.println("resultado ordenado, en la posición 0 está: " + numbers2[0]);
		System.out.println("resultado ordenado, en la última posición está: " + numbers2[5]);
		System.out.println(Arrays.toString(numbers2));
		
		
		//Obtener longitud de un Array
		int[] userAge = {21, 22, 58, 40, 33};
		int longitud = userAge.length;
		System.out.println("El número de elementos del Array es: " + longitud);
 		
		
		

	}

}
