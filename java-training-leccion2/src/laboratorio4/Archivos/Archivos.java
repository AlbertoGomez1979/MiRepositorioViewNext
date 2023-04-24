package laboratorio4.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Archivos {

	//CREAR DIRECTORIO
	//CREAR ARCHIVO O FICHERO
	//ESCRIBIR EN EL ARCHIVO
	//LEER EL ARCHIVO
	//RENOMBRAR
	
	
	
	public static void main(String[] args) throws Exception {
		
		File ruta = new File("c:/laboratorio"); //ruta del directorio
		
		//CREAR DIRECTORIO
		crearDitectorio();
		
		
		
		//CREAR ARCHIVO
		File f = new File(ruta, "datos.txt"); //nombre del archivo, con la ruta donde se va a crear
		
		if(!f.exists()) {
			System.out.println("fichero " + f.getName() + " No existe");
			if(f.createNewFile()) {  //se crea el fichero, si se ha creado correctamente aparece mensaje de creado.
				System.out.println("Fichero "+ f.getName()+ " creado");
				
			} else {
				System.out.println("No se ha creado " + f.getName());
			}
		}
		
		//ESCRIBIR EN EL ARCHIVO
		try {
			
			Writer w = new FileWriter("c:\\laboratorio\\datos.txt");
			String content = "Holaaaaaaaa a todosssssss!!!!!!";
			w.write(content);
			w.close();
			System.out.println("!!Hecho!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//LEER EL ARCHIVO A TRAVÉS DEL MÉTODO 
		muestraContenido("C:\\laboratorio\\datos.txt");
		
		
		//RENOMBRAR
		File file1 = new File("C:\\laboratorio\\datos.txt"); //Nombre original del archivo
		File file2 = new File("C:\\laboratorio\\nuevosDatos.txt");		//Nuevo nombre que se le va a dar
		
		if(file2.exists()) //Si existe...
			
		throw new Exception("Archivo existe");
		
		boolean success = file1.renameTo(file2);
		
		if(success) { //SI EL RENAME SE HACE. success es true
			System.out.println("Renombrado con exito");
		}else {
			System.out.println("NO RENOMBRADO!!!!");
		}
		
		
		
	}
	
		//CREAR DIRECTORIO
		public static void crearDitectorio() {
			
			File ruta = new File("c:/laboratorio"); //ruta del directorio
			File f = new File(ruta, "datos.txt"); //nombre del archivo, con la ruta donde se va a crear
			if(!ruta.exists()) { //si no existe el directorio
				System.out.println("El directorio " + ruta.getName()+ " no existe");
				
					if( ruta.mkdir()) { //Se crea el directorio
						System.out.println("Directorio creado");
					}else {
						System.out.println("No se ha creado "+ ruta.getName());
					}

			}
			
			
			
		}
		
		//METODO PARA LEER UN ARCHIVO
		public static void muestraContenido(String datos) throws FileNotFoundException, IOException{
			
			String cadena;
			FileReader f = new FileReader(datos); //permite leer el archivo
			
			BufferedReader b = new BufferedReader(f); //se almacena en el buffer
			
			while((cadena = b.readLine()) != null) { //Mientras se lea la cadena, se va escribiendo
				System.out.println(cadena);
			}
			b.close(); //se cierra el buffer
		
		
	}
}
