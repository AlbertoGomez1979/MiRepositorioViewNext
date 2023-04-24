package training.lab1;

public class Operadores {

	public static void main(String[] args) {
		// El signo de igualdad se usa para asignar
		int x = 5;
		int y = 10;
		
		x = y;
		System.out.println("Nueva asignación de X: " + x);
		
		//Operadores básicos
		
		//Suma
		x = x + 2;
		System.out.println("Sumando un valor a la X: " + x);
		
		x += 2;
		System.out.println("Sumando a X con otro operador(x +=): " + x);
		
		//Incrementar 1 a X
		x++; //otra forma es ++x;
		System.out.println("Incrementando en 1 el valor de X: " + x);
		
		//Resta
		x = x - 2;
		//Otra forma de hacerlo es x -= 2;
		System.out.println("Restando un valor a X: " + x);
		
		//multiplicación
		x = x * 2 ;
		//Otra forma sería x *= 2;
		System.out.println("Multiplicando la X por un valor: " + x);
		
		//División
		x = x / 3;
		//otra forma sería x /= 3;
		System.out.println("Dividiendo X por un valor: " + x);
		
		
		//Operadores- COndicionales
		//equals (==)		
		int userAge = 34;
		int userAge1 = 34;
		int userAge2 = 20;
		
		if(userAge == userAge1) {
			System.out.println("Las edades son iguales");
		}
		
		//Not equals (!=)
		if(userAge != userAge2) {
			System.out.println("Las edades son diferentes");
		}
		
		//Operador y , (&&)
		if(userAge2 > 0 && userAge1 > 0) {
			System.out.println("Las edades son mayores de cero");			
		}
		
		//Operador or, (||)
		if(userAge < 40 || userAge1 > 100) {
			System.out.println("Se cumple solo una de las condiciones de las edades");
		}
		
		

	}

}
