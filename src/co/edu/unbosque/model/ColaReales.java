package co.edu.unbosque.model;

/**
 * @author David Lopez , Jorge Ramirez
 */
public class ColaReales implements IColaReales {

    private Double[] cola;
    private int frente, fin;

    /**
     * Metodo constructor de la clase ColaReales
     *
     * @param size Entero para inicializar la cola.
     */

    public ColaReales(int size) {
        cola = new Double[size];
        frente = fin = -1;
    }

    /**
     * Metodo que inserta un nuevo elemento en la cola.
     *
     * @param elemento es el nuevo elemtno en la estructura
     * @throws Exception Lanzada si la cola esta llena
     */
    @Override
    public void queue(Double elemento) throws Exception {
        if (isFull()) {
            throw new Exception("Cola llena");
        } else {
            fin++;
            cola[fin] = elemento;
        }

    }

    /**
     * Metodo que remueve el primer elemento en la cola
     *
     * @return Elemento a salir de la cola
     * @throws Exception Lanzada si la cola esta vacia
     */

    @Override
    public Double dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacia");
        } else {
            return cola[++frente];
        }
    }

    /**
     * Metodo que obtiene(sin removerlo) el primer elemento de la cola
     *
     * @return Primer elemento de la cola
     * @throws Exception Lanzada si la cola esta vacia
     */

    @Override
    public Double getFirst() throws Exception {
        int aux = frente;
        aux++;
        return cola[aux];
    }

    /**
     * Metodo optiene numero de elemnto en la cola
     *
     * @return int que indica la cantidad de elementos en la cola
     */
    @Override
    public int getNumberOfElements() {
        int cont = 0;
        for (int i = 0; i < cola.length; i++) {
            if (cola[i] != null) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Metodo que inidica si la cola se encuentra llena.
     *
     * @return boolean que indica si la cola esta llena o no.
     */

    @Override
    public boolean isFull() {
        return fin == cola.length - 1;
    }

    /**
     * Metodo que indica si la cola se encuetra vacia.
     *
     * @return boolean que indica si la cola esta vacia.
     */

    @Override
    public boolean isEmpty() {
        return frente == fin;
    }

    /**
     * Metodo que nos sirve para mostrar la cola.
     *
     * @return  String con los elementos en la cola
     * @throws Exception Lanzada si la cola esta vacia
     */

    public String mostrar() throws Exception {
        String r = "";
        if (isEmpty()) {
            throw new Exception("La cola esta vacia");
        } else {
            for (int i = frente; i < fin; i++) {
                r += cola[i + 1] + " ";
            }
        }
        return r;
    }
}

