package training.lab2.polimorfismo;

public class VPeugeot extends Vehiculo{
	
	private int numpuertas;

	public VPeugeot(String matricula, String marca, String tipo, int numpuertas) {
		super(matricula, marca, tipo);
		this.numpuertas = numpuertas;
	}

	public int getNumpuertas() {
		return numpuertas;
	}

	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}

	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo + "\nnumero de puertas: " + numpuertas;
	}
	
	

}
