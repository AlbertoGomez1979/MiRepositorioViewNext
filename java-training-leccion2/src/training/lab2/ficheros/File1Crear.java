package training.lab2.ficheros;

import java.io.File;
import java.io.IOException;

//crear un fichero o directorio
public class File1Crear {

	public static void main(String[] args) throws IOException {
		
		File ruta = new File("c:/ficheros"); //ruta del directorio
		
		File f = new File(ruta, "datos.txt"); //nombre del archivo
		
		System.out.println(f.getAbsolutePath()); //imprime la ruta absoluta del archivo
		System.out.println(f.getParent()); //DEVUELVE UN STRING CONTENIDO EN EL DIRECTORIO PADRE
		
		System.out.println(ruta.getAbsolutePath());
		System.out.println(ruta.getParent()); //ruta del padre
		
		if(!f.exists()) {
			System.out.println("fichero " + f.getName() + " No existe");
			
				if(!ruta.exists()) {
					System.out.println("El directorio " + ruta.getName()+ " no existe");
					
						if( ruta.mkdir()) {
							System.out.println("Directorio creado");
						
						
						if(f.createNewFile()) {  //se crea el fichero, si se ha creado correctamente
						System.out.println("Fichero "+ f.getName()+ " creado");
						
					} else {
						System.out.println("No se ha creado " + f.getName());
					}
				}else {
					System.out.println("No se ha creado "+ ruta.getName());
				}
		}else {
			if(f.createNewFile()) {
				System.out.println("fichero " + f.getName() + " creado");
			}else {
				System.out.println("No se ha creado");
			}
		}

	}else { //Existe el fichero, mostramos el tamaño
		System.out.println("Fichero " + f.getName() + " existe");
		
		System.out.println("Tamaño " + f.length() + " bytes") ;
	}

}
}
