package training.javaee.jsp.operacion;

public class Operacion {

	private static int numero2;
	private static int resultado;
	

	public static int mostrarSuma(int numero1, int numero2) {

		resultado = (numero1 + numero2);

		return resultado;

	}
	
	//NO SE PERMITE EN JSPWRITER UN METODO VOID, TIENE QUE RETORNAR ALGO, COMO EL MÉTODO MOSTRARSUMA
	public static int tablaResultado(int numero1) {
		
		numero2 = 0;
		
		while(numero2<=10) {
			resultado = numero1*numero2;
			numero2++;
			System.out.println(resultado);
		}
		
		return resultado;
		 
		
		}
		
		
		
		
}


