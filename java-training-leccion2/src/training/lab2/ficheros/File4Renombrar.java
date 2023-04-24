package training.lab2.ficheros;

import java.io.File;

public class File4Renombrar {

	//RENOMBRAR UN ARCHIVO
	public static void main(String[] args) throws Exception {
		
		File file1 = new File("C:\\ficheros\\output.txt"); //Nombre original del archivo
		File file2 = new File("C:\\ficheros\\out.txt");		//Nuevo nombre que se le va a dar
		
		if(file2.exists()) //Si existe...
			
		throw new Exception("Archivo existe");
		
		boolean success = file1.renameTo(file2);
		
		if(success) { //SI EL RENAME SE HACE. success es true
			System.out.println("Renombrado con exito");
		}else {
			System.out.println("NO RENOMBRADO!!!!");
		}

	}

}
