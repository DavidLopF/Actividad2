package co.edu.unbosque.controller;

import co.edu.unbosque.model.ColaReales;
import co.edu.unbosque.model.PilaEstatica;
import co.edu.unbosque.view.View;


public class Controller {

    private PilaEstatica pilaEstatica;
    private ColaReales colaReales;
    private View vista;

    public Controller() {

        vista = new View();
        funcionar();
    }

    private void funcionar() {
        String opcion = vista.menuPrincipal();

        switch (opcion) {
            case "1. Pila Estatica":
                int size = vista.caputrarDatoNumerico("Ingrese valor para el tamaño de la pila:");
                pilaEstatica = new PilaEstatica(size);
                vista.mostrarMensaje("Pila Creada con exito.");
                opcionesPila();
                break;

            case "2. Cola Dinamica":
                size = vista.caputrarDatoNumerico("Ingrese valor para el tamaño de la cola: ");
                colaReales = new ColaReales(size);
                vista.mostrarMensaje("cola Creada con exito.");

                break;

            case "Salir":
                vista.mostrarMensaje("Hasta pronto :)");
                break;
        }
    }

    private void opcionesCola(){

    }

    private void opcionesPila() {
        String opcionPila = vista.menuPilaEstatica();
        switch (opcionPila) {
            case "1. Agregar elemento a la pila":
                if (!pilaEstatica.isFull()) {
                    int elemento = vista.caputrarDatoNumerico("Ingrese valor a agregar a la pila: ");
                    pilaEstatica.push(elemento);
                    vista.mostrarMensaje("La pila es:\n\n" + pilaEstatica.imprimirPila());
                    opcionesPila();
                } else {
                    vista.mostrarMensaje("La pilla esta llena");
                    opcionesPila();
                }
                break;

            case "2. LLenar pila con número aleatorios":
                if (!pilaEstatica.isFull() && pilaEstatica.isEmpty()) {
                    pilaEstatica.pushRandom();
                    vista.mostrarMensaje("La pila es:  \n" + pilaEstatica.imprimirPila());
                    opcionesPila();
                } else {
                    vista.mostrarMensaje("Para llenar la pila con números aletorios debe estar vacia.");
                    opcionesPila();
                }
                break;

            case "3. Remover elemento en la cima de la pila":
                if (!pilaEstatica.isEmpty()) {
                    vista.mostrarMensaje("El elemento " + pilaEstatica.pop() + " a sido removido con exito\n\n" + "La pila es:  \n" + pilaEstatica.imprimirPila());
                    opcionesPila();
                } else {
                    vista.mostrarMensaje("La pila esta vacia, no hay elementos a desapilar.");
                    opcionesPila();
                }
                break;
            case "4. Optener número de elementos de la pila ":
                vista.mostrarMensaje("EL tamaño de la pila es " + pilaEstatica.getPila().length + " y tiene " + pilaEstatica.getNumberOfElements()
                        + " elementos apilados");
                opcionesPila();
                break;
            case "5. Indicar si la pila esta llena":
                if (pilaEstatica.isFull()) {
                    vista.mostrarMensaje("La pila esta llena");
                } else {
                    vista.mostrarMensaje("La pila no esta llena");
                }
                opcionesPila();
                break;
            case "6. Indicar si la pila esta vacia":
                if (pilaEstatica.isEmpty()) {
                    vista.mostrarMensaje("La pila esta vacia");
                } else {
                    vista.mostrarMensaje("La pila no esta vacia");
                }
                opcionesPila();
                break;
        }
    }


}
