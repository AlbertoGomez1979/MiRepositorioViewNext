package training.lab8.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import training.lab8.junit.Operaciones;

class OperacionesTest {
	
	static Operaciones instance; //Instanciamos el objeto 

	public OperacionesTest() {
		
	}
	
	//Antes de las cualquier prueba
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		instance = new Operaciones(5, 10);
		
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("-------Inicio del test----------");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hora:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
	}

	//Test de SUMA
	@Test
	void Suma() throws Exception{
		System.out.println("Test de suma");
		
		assertEquals(15, instance.sumar(5, 10));
	}
	
	//Test de RESTA
	@Test
	void Restar() throws Exception{
		System.out.println("Test de resta");
				
		assertEquals(5, instance.restar(10, 5));
	}
	
	//Test de ERROR
	@Test
	void Error() throws Exception{
		System.out.println("Test de error");
				
		assertNotEquals(30, instance.restar(10, 5));
	}
	
	
	
	

}
