package training.lab4.lambda;

public class Main {
	
	//Las expresiones Lambda implementan un mètodo definido en una interfaz funcional
	//Sintaxis: (parametros)->{cuerpo-lambda}
	//Operador(->)

	public static void main(String[] args) {

		//Ejemplo 1. Sin parametros
		//Para implementar el mÃ©todo definido en nuestra interfaz funcional
		//Definimos la expresiÃ³n lambda
		IMostrarMensaje mensaje1=()->System.out.println("expresion lambda con interfaz IMostrarMensaje1");
	    //no hace falta utilizar las llaves y el return para devolver valores
		mensaje1.mensaje();
		
		//ejemplo 2, lambda con parametro
		IMostrarMensaje2 mensaje2 = (name) -> System.out.println(name + " Esto es lambda 2");
		
		mensaje2.mensaje("juan");
		
		//ejemplo 3, con número entero
		INumIncrement f = (num) -> num+5;
		System.out.println(f.incrementPorCinco(80));
		
		//ejemplo 4, con multiples parametros concatenados
		IMultipleParams p = (str1, str2) -> str1 + str2;
		System.out.println("resultado : " + p.MostrarNombres("juan", " Perez"));
	
		
	
	
	
	
	}

}
