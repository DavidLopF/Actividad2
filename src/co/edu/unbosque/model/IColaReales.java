package co.edu.unbosque.model;

/**
 * @author David Lopez , Jorge Ramirez
 */

public interface IColaReales {


    /**
     * Metodo que inserta un nuevo elemento en la cola.
     *
     * @param elemento es el nuevo elemtno en la estructura
     * @throws Exception Lanzada si la cola esta llena
     */
    public void queue(Double elemento) throws Exception;

    /**
     * Metodo que remueve el primer elemento en la cola
     *
     * @return Elemento a salir de la cola
     * @throws Exception Lanzada si la cola esta vacia
     */

    public Double dequeue() throws Exception;

    /**
     * Metodo que obtiene(sin removerlo) el primer elemento de la cola
     *
     * @return Primer elemento de la cola
     * @throws Exception Lanzada si la cola esta vacia
     */

    public Double getFirst() throws Exception;

    /**
     * Metodo optiene numero de elemnto en la cola
     *
     * @return int que indica la cantidad de elementos en la cola
     */
    public int getNumberOfElements();

    /**
     * Metodo que inidica si la cola se encuentra llena.
     *
     * @return boolean que indica si la cola esta llena o no.
     */

    public boolean isFull();

    /**
     * Metodo que indica si la cola se encuetra vacia.
     *
     * @return boolean que indica si la cola esta vacia.
     */
    public boolean isEmpty();
}
