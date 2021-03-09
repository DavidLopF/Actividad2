package co.edu.unbosque.model;

/**
 * @author David Lopez , Jorge Ramirez
 */

public interface IPilaEnteros {

    /**
     * Metodo que inserta un nuevo elemnto de la pila
     *
     * @param element es el nuevo elemento en la estructura
     */
    public void push(int element);

    /**
     * Metodo que remueve el elemento en la cima de la pila.
     *
     * @return elemento removido de la cima
     */

    public int pop();

    /**
     * Metodo que obtiene (sin removerlo) el elemento de la clase pila
     *
     * @return elemento en la cima de la cola
     */
    public int getTop();

    /**
     * Metodo que obtien el numero de elementos en la pila
     *
     * @return entero con el valor de elementos de la cola
     */

    public int getNumberOfElements();

    /**
     * Metodo que inidica si la pila se ecuentra llena
     *
     * @return boolean que indica si la pila esta llena
     */

    public boolean isFull();

    /**
     * Metood que indica si la pila se encuentra vacia.
     *
     * @return boolean que indica si la pila esta vacia
     */

    public boolean isEmpty();
}
