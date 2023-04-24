package training.lab1;

public class Flujos {

	public static void main(String[] args) {
		
		//BUCLES
		
		//for
		System.out.println("\nSentencia for");
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("\nSentencia for trabajando con Array");
		int [] myNumbers = {10, 20, 30, 40, 50};
		//para pintar el array
		for(int i = 0; i < myNumbers.length; i++) {
			System.out.println(myNumbers[i]);
		}
		
		//SE INTERRUMPE EL PROGRAMA DE SE PRODUCE EL BREAK.
		System.out.println("\nSetencia for trabajando con break");
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
				if(i==2)
					break;
		}
		
		
		//while
		//se inicia en 5, cuando llege a cero, se termina el while
		System.out.println("\nSentencia while");
		int counter = 5;
		while(counter >= 0) {
			System.out.println("Counter = " + counter);
			//counter = counter - 1;
			counter--;
		}
		
		
		//Do while,se ejecuta al menos una vez
		System.out.println("\nSentencia do while");
		int counter2 = 10;
		do {
			System.out.println("Counter2 = " + counter2);
			counter2++;
		}while(counter2 < 0);
		

	}

}
