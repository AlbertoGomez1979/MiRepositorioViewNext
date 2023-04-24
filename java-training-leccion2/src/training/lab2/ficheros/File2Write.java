package training.lab2.ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class File2Write {

	//SE CREA EL ARCHIVO Y SE ESCRIBE EN ÉL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			Writer w = new FileWriter("c:\\ficheros\\output.txt");
			String content = "Holaaaaaaaa";
			w.write(content);
			w.close();
			System.out.println("!!Hecho!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
