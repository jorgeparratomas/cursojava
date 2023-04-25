package prueba.semana2.controller;

/**
 * MyApp.java
 *
 * @autor: Antonio Garces
 * @revisor: Carlos Arranz
 * @version: 1.0
 */
public class MyApp {

    /**
     * Pide al usuario que seleccione un vehiculo y una accion.
     *
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        // Creamos 3 vehiculos, uno de cada tipo, ademas de declara las variables
        // necesarias
        VehiculoManager vehiculoManager = new VehiculoManager();
        vehiculoManager.createVehiculo();
        while (!vehiculoManager.runAccion()) {
        }

    }

}
