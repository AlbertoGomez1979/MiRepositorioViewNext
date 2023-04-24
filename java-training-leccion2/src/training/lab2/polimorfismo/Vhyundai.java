package training.lab2.polimorfismo;

public class Vhyundai extends Vehiculo{
	
	private int carga;

	public Vhyundai(String matricula, String marca, String tipo, int carga) {
		super(matricula, marca, tipo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo + "\ncarga: " + carga + "kg";
}
	


}
