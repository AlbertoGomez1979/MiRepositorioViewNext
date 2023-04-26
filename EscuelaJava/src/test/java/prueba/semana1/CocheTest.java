package prueba.semana1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import prueba.semana1.model.Coche;

public class CocheTest {
	
	/**
	 * Instanciamos la clase Coche
	 */
	static Coche instance;
	
	 /**
	  * Constructor
	  */
	public CocheTest() {
		
	}

	/**
	 * Método que se ejecuta antes de cada prueba
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new Coche("Rojo", "Toyota", "20.000 €", "SADF12", "Manual", "Deportivo");
	}

	/**
	 * Método que se ejecuta después de hacer las pruebas
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Se ejecuta antes de cada método de test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("-------------Inicio del test--------------");
	}

	/**
	 * Se ejecuta después de cada método, establecemos la hora del test
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Hora:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
	}

	/**
	 * Test que comprueba si el coche arranca
	 */
	@Test
	public void test() {
		System.out.println("Comprobar si el coche arranca: ");
		
		instance.arrancar();
		boolean arrancado = instance.getArrancado();
		
		//Comprobamos los resultados.
		assertEquals(arrancado, true);

		
	}

}
