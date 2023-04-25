package prueba.semana2.controller;

import prueba.semana2.model.Vehiculo;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import prueba.semana2.model.Barco;
import prueba.semana2.model.Coche;
import prueba.semana2.model.Vehiculo;
import prueba.semana2.persistence.JPAPersistence;
/**
 * Dbhandler
 * Se encarga de gestionar la utilización de la Base de Datos.
 */
public class Dbhandler {
	
	EntityManager entity = JPAPersistence.getEntityManagerFactory().createEntityManager();
	
	
	/**
	 * Constructor vacio
	 */
	public Dbhandler() {
		super();
	}

	/**
	 * Crea un nuevo vehiculo en la Base de Datos.
	 * @param vehiculo inserta dicho vehiculo en la Base de Datos.
	 */

	public void crear(Vehiculo vehiculo) {

		entity.getTransaction().begin(); // aqui le digo que inicie la transacción
		entity.persist(vehiculo); // aqui le indico a través del método persidt que guarde en BD
		entity.getTransaction().commit(); // aqui le indico que culmine

	}
}
