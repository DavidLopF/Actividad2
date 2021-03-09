package co.edu.unbosque.model;

import java.util.Random;

/**
 * @author David Lopez , Jorge Ramirez
 */

public class PilaEstatica implements IPilaEnteros {
    private int pila[];
    private int cima;

    /**
     * Metodo constructor de la clase PilaEstatica
     * @param size Entero necesario para inicializar la pila
     */

    public PilaEstatica(int size) {
        pila = new int[size];
        cima = -1;

    }

    /**
     * Metodo que inserta un nuevo elemnto de la pila
     *
     * @param element es el nuevo elemento en la estructura
     */
    @Override
    public void push(int element) {
        cima++;
        pila[cima] = element;
    }

    /**
     * Metodo que remueve el elemento en la cima de la pila.
     *
     * @return elemento removido de la cima
     */

    @Override
    public int pop() {
        int aux = pila[cima];
        pila[cima] = 0;
        cima--;
        return aux;
    }

    /**
     * Metodo que obtiene (sin removerlo) el elemento de la clase pila
     *
     * @return elemento en la cima de la cola
     */
    @Override
    public int getTop() {
        return pila[cima];
    }

    /**
     * Metodo que obtien el numero de elementos en la pila
     *
     * @return entero con el valor de elementos de la cola
     */
    @Override
    public int getNumberOfElements() {
        return cima + 1;
    }

    /**
     * Metodo que inidica si la pila se ecuentra llena
     *
     * @return boolean que indica si la pila esta llena
     */
    @Override
    public boolean isFull() {
        return pila.length - 1 == cima;
    }

    /**
     * Metood que indica si la pila se encuentra vacia.
     *
     * @return boolean que indica si la pila esta vacia
     */

    @Override
    public boolean isEmpty() {
        return cima == -1;

    }

    /**
     * Metodo que llena la pila con numeros aleatorios
     */

    public void pushRandom() {
        for (int i = 0; i < pila.length; i++) {
            Random rnd = new Random();
            push(rnd.nextInt(1000));
        }
    }

    /**
     * Metodo que nos indica los elementos que estan en la pila
     *
     * @return String con los elementos de la pila
     */

    public String imprimirPila() {
        String r = "";
        for (int i = pila.length - 1; i > -1; i--) {
            r += pila[i] + "\n";
        }
        return r;
    }

    public int[] getPila() {
        return pila;
    }
}
