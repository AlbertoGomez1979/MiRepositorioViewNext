package training.lab2.ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File3Eliminar {

	//Eliminar archivo
	public static void main(String[] args) {
		
		String file_name = "C:\\ficheros\\out.txt";
		
		Path path = Paths.get(file_name); //SE BUSCA EL ARCHIVO Y SE GUARDA
		
		try {
			boolean result = Files.deleteIfExists(path);
			if(result) {
				System.out.println("ELIMINADO!!!");
			}else {
				System.out.println("NO se ha podido eliminar");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
