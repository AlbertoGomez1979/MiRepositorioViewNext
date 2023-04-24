package training.lab2.polimorfismo;

public class VMaserati extends Vehiculo{

	private int motor;

	public VMaserati(String matricula, String marca, String tipo, int motor) {
		super(matricula, marca, tipo);
		this.motor = motor;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo + "\nmotor: " + motor;
	}
	
	

}
