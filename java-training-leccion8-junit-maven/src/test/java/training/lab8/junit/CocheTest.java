package training.lab8.junit;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.function.Executable;

import training.lab8.junit.Coche;


class CocheTest {
	
	static Coche instance; //Instancia del objeto al que se la va hacer el test

	//Contructor
	public CocheTest() {		
	}
	
	//Lo más importante son las anotaciones, las clases se pueden llamar diferente.
	@BeforeAll
	//La anotación indica que se ejecuta antes de cualquier prueba
	static void setUpClass() throws Exception {
		
		instance = new Coche("Audi", 10000);
		Coche.impuesto =20f;
	}

	@AfterAll
	//Se ejecuta despues de hacer todas las pruebas
	static void tearDownAfterClass() throws Exception {				
	}

	@BeforeEach
	//Se ejecuta antes de cada método de test
	void setUp() throws Exception {
		System.out.println("---------------Inicio del test------------------");
	}

	@AfterEach
	//Se ejecuta después de cada método, se imprime hora
	void tearDown() throws Exception {
		System.out.println("Hora:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
	}

	/**
	 * Test del metodo precioFinal de la clase Coche
	 * Prueba para dar el descuento.
	 * @throws Exception
	 */
	@Test
	void preciofinal_1() throws Exception{
		
		System.out.println("PrecioFinal Coche CON descuento");
		
		float descuento = 10F; //Valor del descuento
		float expResult = 10800; //Precio final, pasa de los 5000 de la clase coche RESULTADO ESPERADO
		float result = instance.precioFinal(descuento); //Pasa el valor del descuento para el cálculo del método
		
		System.out.println("Precio final del resultado: " + result);
		assertEquals(expResult, result); //assertEquals iguala los resultados
		//Si son iguales, utiliza el método equals	
	}
	
	/**
	 * Test para que no dé el descuento.
	 * @throws Exception
	 */
	@Test
	void Preciofinal_2() throws Exception{
		
		System.out.println("PrecioFinal Coche SIN descuento");
		
		float descuento = 10.0F; //Valor del descuento
		instance.precioBase = 1000F; //precio base
		float expResult = 1200; //Precio final, mas barato PARA QUE DE ERROR
		float result = instance.precioFinal(descuento); //Pasa el valor del descuento para el cálculo del método
		
		assertEquals(expResult, result, 0.000001); //assertEquals iguala los resultados
		//Si son iguales, utiliza el método equals			
	}
	
	/**
	 * Test para descuento INCORRECTO
	 * @throws Exception
	 */
	@Test
	void Preciofinal_3() throws Exception{
		
		System.out.println("PrecioFinal Coche con descuento INCORRECTO");
		
		//assertThrows lanza el error(mensaje: descuento incorrecto.
		assertThrows(Exception.class, new Executable() {
		float descuento = 110F; //Valor del descuento
		
		
		public void execute() throws Throwable{
			float result = instance.precioFinal(descuento);
		}});
				
	}

}
