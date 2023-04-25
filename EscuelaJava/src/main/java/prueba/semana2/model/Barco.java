package prueba.semana2.model;

import javax.persistence.*;

/**
 * Barco.java Clase para el objecto Barco
 *
 * @autor: Antoni
 * @revisor: Carlos
 * @version: 1.0
 */
@Entity
@Table(name = "barco")
public class Barco extends Vehiculo {
	@Column
    private String tipoBarco;
	@Column
    protected static final String TIPO = "Barco";
	
	/**
	 * Constructor vacio
	 */

    public Barco() {
		super();
	}

	/**
     * Constructor de la clase Barco.
     *
     * @param color     El color del Barco.
     * @param marca     La marca del Barco.
     * @param precio    El precio del Barco.
     * @param matricula La matricula del Barco.
     * @param tipoBarco El tipo de Barco.
     */
    public Barco(String color, String marca, String precio, String matricula, String tipoBarco) {
        super(color, marca, precio, matricula, 0);
        this.tipoBarco = tipoBarco;

    }

    /**
     * Devuelve el tipoBarco.
     *
     * @return String
     */
    public String getTipoBarco() {
        return tipoBarco;
    }

    @Override // <- Bien por el uso de Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un barco");
        System.out.println("Este barco es de tipo" + tipoBarco);
        super.imprimirDatos();
    }

}
