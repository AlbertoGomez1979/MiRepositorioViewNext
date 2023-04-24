package training.lab1;

public class Cadenas {

	public static void main(String[] args) {
		//Manejo de Strings
		String myName = "Hello world, " + "Mi nombre es Alberto";
		System.out.println(myName);
		
		//METODOS DE STRING
		//Longitud de cadena
		System.out.println("hello world".length());
		
		//Convertir a minúscula
		System.out.println("HELLO WORLD".toLowerCase());
		
		//Pasar a mayúsculas
		System.out.println("hello world".toUpperCase());
		
		//Extraer una parte de la cadena a partir de una posición
		String first = "hello world".substring(6);
		System.out.println(first);
		
		//Extraer una parte de la cadena a partir de una posición y acotando la posicion final
		String message= "hello world";
		String second = message.substring(1,8);
		System.out.println(second);
		
		//Selecciona caracter especifico indicando la posicion
		char muChar = "hello world".charAt(4);
		System.out.println(muChar);
		
		//Escape de secuencia
		System.out.println("Escape Sequences ---" + "hello\nworld");
		
		//Validando cadenas.
		boolean equals = "this is jamie".equals("this is jamie");
		boolean equalsNo = "this is jamie".equals("hola");
		
		System.out.println(equals);
		System.out.println(equalsNo);
		
		//Separando cadenas
		String names = "Peter, jhon, Andy";
		//el array es asignado a la variable split
		String[] split = names.split(", ");
		
		System.out.println(split[0]);
		System.out.println(split[2]);

	}

}
