package training.lab4.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListaNombres {

	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Juan", "perez", "developer", 20));
		personas.add(new Persona("Juan", "perez", "developer", 20));
		personas.add(new Persona("Juan", "perez", "developer", 20));
	
		//foreach utilizando lambda
		personas.forEach((p)->System.out.println(p.getName()));
		
		//foreach usando lamda con condiciones
		personas.forEach(user->{
			if("Juan".equals(user.getName())) {
				System.out.println("hola Juan");
			}else {
				System.out.println(user.getName());
			}
		});
		
		
	
	}

}
