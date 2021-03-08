package co.edu.unbosque.model;

public class ColaReales implements IColaReales {

    private Double[] cola;
    private int inicio, fin;

    public ColaReales(int tamaño) {
        cola = new Double[tamaño];
        inicio = cola.length;
        fin = -1;
    }

    @Override
    public void queue(Double elemento) throws Exception {
        if (!isFull()) {
            cola[fin++] = elemento;
        } else {
            throw new Exception("Overflow en la cola");
        }

    }

    @Override
    public double dequeue() throws Exception {
        if (!isEmpty()) {
            return cola[inicio++];
        } else {
            throw new Exception("Cola vacia");
        }
    }

    @Override
    public double getFirst() throws Exception {
        if (!isEmpty()) {
            return cola[inicio];
        } else {
            throw new Exception("Cola vacia");
        }
    }

    @Override
    public int getNumberOfElements() {
        return fin +1;
    }

    @Override
    public boolean isFull() {
        return fin == cola.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return inicio > fin;
    }
}
