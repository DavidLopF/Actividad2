package co.edu.unbosque.controller;

import co.edu.unbosque.model.ColaReales;
import co.edu.unbosque.model.PilaEstatica;
import co.edu.unbosque.view.View;

/**
 * @author David Lopez , Jorge Ramirez
 */
public class Controller {

    private PilaEstatica pilaEstatica;
    private ColaReales colaReales;
    private View vista;

    /**
     * Metodo constructor de la clase Controller
     *
     * @throws Exception
     */

    public Controller() {

        vista = new View();
        try {
            funcionar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo encargado de en unir la vista y el modelo para que pueda funcionar el programa correctamente
     *
     * @throws Exception
     */

    private void funcionar() throws Exception {
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
                vista.mostrarMensaje("Cola creada con exito.");
                opcionesCola();
                break;

            case "Salir":
                vista.mostrarMensaje("Hasta pronto :)");
                break;
        }
    }

    /**
     * Metoodo que hace los metodos de la cola
     *
     * @throws Exception
     */
    private void opcionesCola() throws Exception {
        String opcionCola = vista.menucola();
        switch (opcionCola) {
            case "1. Agregar a la cola.":
                if (!colaReales.isFull()) {
                    Double elemento = vista.capturarDatoNumerico("Ingrese elemento a agregar a la cola");
                    colaReales.queue(elemento);
                    vista.mostrarMensaje("La cola es :\n" + colaReales.mostrar());
                } else {
                    vista.mostrarMensaje("Cola llena !!");
                }
                opcionesCola();
                break;

            case "2. Desencolar elemennto":

                if (!colaReales.isEmpty()) {
                    colaReales.dequeue();
                    vista.mostrarMensaje("La cola es  \n:" + colaReales.mostrar());
                    opcionesCola();
                } else {
                    vista.mostrarMensaje("La cola esta vacia");
                    opcionesCola();
                }

            case "3. Obtener primer elemento de la cola ":
                if (!colaReales.isEmpty()) {
                    vista.mostrarMensaje("El primer elemento de la cola es : " + colaReales.getFirst() + "\nLa cola es :\n" + colaReales.mostrar());
                    opcionesCola();
                } else {
                    vista.mostrarMensaje("La cola esta vacia");
                    opcionesCola();
                }

            case "4. Optener número de elementos de la cola ":
                if (!colaReales.isEmpty()) {
                    vista.mostrarMensaje("Los elementos en cola son: " + colaReales.getNumberOfElements());
                    opcionesCola();
                } else {
                    vista.mostrarMensaje("La cola esta vacia");
                    opcionesCola();
                }

            case "5. Indicar si la cola esta llena":
                if (colaReales.isFull()) {
                    vista.mostrarMensaje("La cola esta llena :(");
                    opcionesCola();
                } else {
                    vista.mostrarMensaje("La cola no esta llena");
                    opcionesCola();
                }

            case "6. Indicar si la cola esta vacia ":
                if (colaReales.isEmpty()) {
                    vista.mostrarMensaje("La cola esta vacia");
                } else {
                    vista.mostrarMensaje("La cola no esta vacia");
                }


        }


    }

    /**
     * Metood que hace los metodos de la pila
     *
     * @throws Exception
     */

    private void opcionesPila() throws Exception {
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

            case "Salir":
                funcionar();
        }
    }


}
