package training.lab2.herencia;

//CLASE HIJA
public class Empleado extends Persona{

	private int numEmpleado;
	private int numContrato;
	
	//Constructor
	public Empleado(int numEmpleado, int numContrato) {
		super();//Llama al constructor de la clase padre(Persona)
		this.numEmpleado = numEmpleado;
		this.numContrato = numContrato;
	}
	
	//M�todo con atributos propios
	public  String getDatosEmpleado() {
		return "El n�mero de empleado es: " + numEmpleado + " y el n�mero de contrato es: " + numContrato;
	}
	
	
}
