package prueba.semana2.model;

/**
 * Interface Conducible.
 */
public interface Conducible { // Conducible
    boolean arrancar();

    boolean avanzar(int distancia);

    boolean retroceder(int distancia);

    boolean parar();

}
