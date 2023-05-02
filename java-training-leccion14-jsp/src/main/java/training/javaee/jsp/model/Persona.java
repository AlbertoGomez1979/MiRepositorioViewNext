package training.javaee.jsp.model;

public class Persona {
	
	private static String resultado;
	
	public static String mostrarNombres(String nombre, String apellido) {
		
		resultado = nombre +" "+ apellido;
		
		return resultado;
	}

}
