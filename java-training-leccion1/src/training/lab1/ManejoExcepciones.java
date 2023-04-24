package training.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {

	public static void main(String[] args) {
		
        int choice = 0;
        Scanner input = new Scanner(System.in);
        int[] numbers = { 10, 11, 12, 13, 14, 15 };
        
        System.out.print("Por favor introduzca una posicion de Array: ");
        try {
        	//Valor que viene del scanner
            choice = input.nextInt();
          //%d hace referencia a choice y %d%n a number[choice]
            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Posicion es invalida.");
            
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor introducido no es un entero.");
            
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }

}
