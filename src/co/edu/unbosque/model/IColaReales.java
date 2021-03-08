package co.edu.unbosque.model;

public interface IColaReales {

    public void queue(Double elemento) throws Exception;

    public double dequeue() throws Exception;

    public double getFirst() throws Exception;

    public int getNumberOfElements();

    public boolean isFull();

    public boolean isEmpty();
}
