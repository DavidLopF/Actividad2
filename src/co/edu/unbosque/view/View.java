package co.edu.unbosque.view;

import javax.swing.*;
import java.net.Inet4Address;

public class View {

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int caputrarDatoNumerico(String mensaje) {
        String r = JOptionPane.showInputDialog(null, mensaje);
        int a = 0;
        if (!esNumero(r)) {
            caputrarDatoNumerico(mensaje);
        } else {
            a = Integer.parseInt(r);
        }
        return a;
    }

    private boolean esNumero(String mensaje) {
        try {
            Integer.parseInt(mensaje);
            mostrarMensaje("Dato ingresado con exito");
            return true;
        } catch (NumberFormatException nfe) {
            mostrarMensaje("Ingrese un dato númerico");
            return false;
        }

    }

    public String menuPrincipal() {
        Object[] opciones = {"1. Pila Estatica", "2. Cola Dinamica", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "      ..:Bienvenido señor usuario :..                " + "\n\n\nSelecciona un operacion a realizar:    ", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        return opcion.toString();
    }

    public String menuPilaEstatica() {
        Object[] opciones = {"1. Agregar elemento a la pila" , "2. LLenar pila con número aleatorios", "3.Remover elemento en la cima de la pila", "4. Optener número de elementos de la pila ",
                "5. Indicar si la pila esta llena","6. Indicar si la pila esta vacia " ,"Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "\nSelecciona un operacion a realizar:\n\n", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        return opcion.toString();
    }
}


