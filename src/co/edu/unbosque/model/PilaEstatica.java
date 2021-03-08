package co.edu.unbosque.model;

import java.util.Random;

public class PilaEstatica implements IPilaEnteros {
    private int pila[];
    private int cima;

    public PilaEstatica(int size) {
        pila = new int[size];
        cima = -1;

    }

    @Override
    public void push(int element) {
        cima++;
        pila[cima] = element;
    }

    @Override
    public int pop() {
        int aux = pila[cima];
        pila[cima] = 0;
        cima--;
        return aux;
    }

    @Override
    public int getTop() {
        return pila[cima];
    }

    @Override
    public int getNumberOfElements() {
        return cima + 1;
    }

    @Override
    public boolean isFull() {
        return pila.length - 1 == cima;
    }

    @Override
    public boolean isEmpty() {
        return cima == -1;

    }

    public void pushRandom() {
        for (int i = 0; i < pila.length; i++) {
            Random rnd = new Random();
            push(rnd.nextInt(1000));
        }
    }

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
