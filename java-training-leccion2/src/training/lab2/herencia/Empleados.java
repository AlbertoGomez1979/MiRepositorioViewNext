package training.lab2.herencia;

//Clase de prueba, esta clase no tiene porqué heredar
public class Empleados {
	
	public static void main(String[] args) {
		
		//Trabajando con atributos de la clase padre(Persona)
		Empleado empleado1 = new Empleado(101, 566666);//Le damos los valores propios de la clase empleado al crear/instanciar el objeto
		
		//Seteamos los valores de empleado heredados de la clase padre(persona)
		empleado1.setNombre("Alberto");
		empleado1.setApellido("Gomez");
		empleado1.setEdad(43);
		
		String name1 = empleado1.getNombre();
		String apellido1 = empleado1.getApellido();
		int edad1 = empleado1.getEdad();
		
		System.out.println("datos de empleado 1: ");
		System.out.println("Nombre: " + name1);
		System.out.println("Apellidos: " + apellido1);
		System.out.println("Edad: " + edad1);
		
		System.out.println(empleado1.getDatosEmpleado());//Método propio de la clase empleado
		
		
	}

	
}
