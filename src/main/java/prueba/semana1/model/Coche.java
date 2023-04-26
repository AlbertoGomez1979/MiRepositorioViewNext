package prueba.semana1.model;

import javax.persistence.*;

import prueba.semana1.model.Vehiculo;

/**
 * Coche.java Clase para el objecto Coche
 */
@Entity
@Table(name = "coche")
public class Coche extends Vehiculo {
	
	/**
	 * Elegir el tipo de marcha:
	 * Automatica o manual
	 */
	@Column(name="tipoMarchas")
    private String tipoMarchas;
	
	/**
	 * Para poder elegir entre:
	 * Deportivo o familiar
	 * 
	 */
	@Column(name="tipoCoche")
    private String tipoCoche;
	
	
    protected static final String TIPO = "Coche";

    /**
     * Constructor de la clase Coche.
     *
     * @param color       color del vehiculo
     * 
     * @param marca       marca del vehiculo
     * 
     * @param precio      precio del vehiculo
     * 
     * @param matricula   matricula del vehiculo
     * 
     * @param tipoMarchas tipo de marchas del coche
     * 
     */
    public Coche(String color, String marca, String precio, String matricula, String tipoMarchas, String tipoCoche) {
        super(color, marca, precio, matricula, 4); // Siempre tiene 4 ruedas si es un coche
        this.tipoMarchas = tipoMarchas;

    }

    /**
     * 
     * @return tipo de marchas
     */
    public String getTipoMarchas() {
        return tipoMarchas;
    }
      
    /**
     * 
     * @param tipoMarchas
     */
    public void setTipoMarchas(String tipoMarchas) {
		this.tipoMarchas = tipoMarchas;
	}

	/**
     * 
     * @return tipoVehiculo
     */
    public String getTipoCoche() {
		return tipoCoche;
	}

    /**
     * 
     * @param tipoVehiculo
     */
	public void setTipoCoche(String tipoCoche) {
		this.tipoCoche = tipoCoche;
	}

	/**
     * imprime los datos del coche.
     *
     **/
    @Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un coche");
        System.out.println("Este coche tiene una marcha " + tipoMarchas);
        System.out.println("Este coche es de tipo " + tipoCoche);
        super.imprimirDatos();
    }

}
