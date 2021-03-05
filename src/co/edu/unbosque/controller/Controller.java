package co.edu.unbosque.controller;

import co.edu.unbosque.model.IPilaEnteros;
import co.edu.unbosque.model.PilaEstatica;
import co.edu.unbosque.view.View;

import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import java.awt.*;

public class Controller {

    private PilaEstatica pilaEstatica;
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

            case "Salir":
                vista.mostrarMensaje("Hasta pronto :)");
                break;
            default:
                vista.mostrarMensaje("Hasta pronto :)");
                break;


        }
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
        }
    }


}
