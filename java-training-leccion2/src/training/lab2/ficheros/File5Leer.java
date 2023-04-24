package training.lab2.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File5Leer {

	//Para leer un archivo
	
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException{
		
		String cadena;
		FileReader f = new FileReader(archivo); //permite leer el archivo
		
		BufferedReader b = new BufferedReader(f); //se almacena en el buffer
		
		while((cadena = b.readLine()) != null) { //Mientras se lea la cadena, se va escribiendo
			System.out.println(cadena);
		}
		b.close(); //se cierra el buffer
				
				
	}
	public static void main(String[] args) throws IOException {
		muestraContenido("C:\\ficheros\\output.txt");
		
	}

}
