package prueba.semana2.model;

import static org.junit.Assert.*;


import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import prueba.semana2.persistence.JPAPersistence;

/**
 * CocheTest
 * Se encarga de realizar un test en la tabla pruebasemana2.coche.
 */

public class CocheTest {
	
	static Coche instance;
	EntityManager entity = JPAPersistence.getEntityManagerFactory().createEntityManager();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new Coche();
		System.out.println("------ Empieza el test -------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("------- El test a finalizado -------");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Es test comprueba que el valor de la id del coche almazenado en la base de datos es igual 1
	 */

	@Test
	public void test() {
		System.out.println("Comprueba que el valor de la id del Coche almacenado el la base de datos sea 1");
		int expResult = 1;
		Coche result =  entity.find(Coche.class, 1);
		
		System.out.println(result);
		
		assertEquals(expResult, result.getId());
	}

}
