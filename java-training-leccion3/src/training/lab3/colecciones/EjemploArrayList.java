package training.lab3.colecciones;

import java.util.ArrayList;

public class EjemploArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Coche> coches = new ArrayList<Coche>();
		
		Coche coche1 = new Coche("Seat", 4444);
		Coche coche2 = new Coche("opel", 3456);
		
		coches.add(coche1);
		coches.add(coche2);
		
		for(Coche c: coches) {
			System.out.println("modelo: " + c.getModelo() + " matrícula: " + c.getMatricula());
		}
		
	}	
		
		
		
	}
	
	class Coche{
		
		private String modelo;
		private int matricula;
		
		public Coche(String modelo, int matricula) {
			super();
			this.modelo = modelo;
			this.matricula = matricula;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		
		
		
		
		
	}
	


