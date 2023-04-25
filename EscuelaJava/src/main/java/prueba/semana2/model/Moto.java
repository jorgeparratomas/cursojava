package prueba.semana2.model;

import javax.persistence.*;

/**
 * Moto.java Clase para el objecto Moto
 */
@Entity
@Table(name = "moto")
public class Moto extends Vehiculo {
	@Column
	private String tipoMoto;
	@Column
	protected static final String TIPO = "Moto";

	/**
	 * Constructor vacio
	 */

	public Moto() {
		super();
	}

	/**
	 * contructor de la clase moto.
	 */
	public Moto(String color, String marca, String precio, String matricula, String tipoMoto) {
		super(color, marca, precio, matricula, 2); // Una moto siempre tiene 2 ruedas
		this.tipoMoto = tipoMoto;

	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	@Override
	public void imprimirDatos() {
		System.out.println("Este vehiculo es una moto");
		System.out.println("Esta moto es de tipo " + tipoMoto);
		super.imprimirDatos();
	}
}
