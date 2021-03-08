package co.edu.unbosque.model;

public interface IPilaEnteros {

    public void push(int element);

    public int pop();

    public int getTop();

    public int getNumberOfElements();

    public boolean isFull();

    public boolean isEmpty();
}
