package training.lab4.reflectionApi;

import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		//EJEMPLO 1: DOS CLASES QUE COMPARTEN TRES ATRIBUTOS.
		List<Alumno> lista = new ArrayList<>();
		lista.add(new Alumno(1001, "Juan", "Perez", "Ingeniero"));
		lista.add(new Alumno(20003, "Rosa", "Garc�a", "Desarrolladora"));

		
		List<Profesor> lista2 = new ArrayList<>();
		lista2.add(new Profesor(0321, "Alberto", "G�mez", "F�sica"));
		lista2.add(new Profesor(0122, "Juan", "Perez", "Matem�ticas"));
		
		//INVOCAMOS  UN UNICO0 M�TODO Y LE PASAMOS COMO PARAMETRO, LA LISTA.		
		//lista alumno
		imprimirLista(lista);
		//lista profesor
		imprimirLista(lista2);
		
		//EJEMPLO 2 : LOS ATRIBUTOS NO COINCIDEN, ACCEDEMOS A UN M�TODO DE LA CLASE..... CREAMOS EL M�TODO QUE COINCIDA.
		List<Carrera> lista3 = new ArrayList<>();
		lista3.add(new Carrera(00233, "Astrof�sica"));
		//IMPRIMIMOS LA LISTA CARRERA
		imprimirLista(lista3);
		
		//OBTENER NOMBRE DE LA CLASE
		Class alumno = Alumno.class;
		System.out.println("El nombre de la clase es: " + alumno.getName());
		
		//OBTENER MODIFICADORES DE ACCESO DE LA CLASE.
		int alumnoAccessModifier = alumno.getModifiers();
		System.out.println("Los modificadores de acceso son: " + Modifier.toString(alumnoAccessModifier));
		
		//OBTENER ATRIBUTOS DE LA CLASE
		Field[] alumnoField1 = alumno.getDeclaredFields();
		
		for(Field field: alumnoField1) {
			System.out.println("Atributo - Variable Nombre : " + field.getName());
		}
		
	}
	
	private static void imprimirLista(List<?> lista) {
		for(Object c: lista) {
			
			//Obtener todos los metodos de la clase, alumno en este caso
			Method[] metodos = c.getClass().getMethods();	
				
		//Recorremos todos los m�todos
		for(Method m : metodos) {			
				System.out.println(m.getName());
				
			//Se comprueba si hay algun metodo que se llame getnombe o getApellido
			if(m.getName().equals("getnombre") || m.getName().equals("getApellido")) {
				
				try {
					
					//Con invoke se indica que obtenga el valor de esos m�todos encontrados
					String cadena = (String) m.invoke(c);//parametros c, que es el objeto, y si aparece null es porque es objeto con parametros
					//Se imprime lo que hay en getnombre y getApellido
					System.out.println(cadena);
				
				}catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) { //EXCEPCIONES DENTRO DEL PAQUETE JAVA.LANG.REFLECT.*
					e.printStackTrace();
				}
			}
			}
		}
	
	}

}
