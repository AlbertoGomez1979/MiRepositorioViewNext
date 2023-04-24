package training.lab1;

public class Conversiones {

	public static void main(String[] args) {
		// Conversion de un short(2 bytes) a double (8 bytes)
		short age = 10;
		double myDouble = age;
		
		System.out.println("Casting de short a double: " + myDouble );
		
		//Conversion de un double(8 bytes) a un int (4 bytes)
		int x = (int) 20.9;
		System.out.println("Casting de double(20.9) a int: " + x);
		
		//Conversion de un doble(8 bytes) a float(4 bytes)
		float num1 = (float) 20.9;
		System.out.println("Casting de double a float: " + num1);

	}

}
