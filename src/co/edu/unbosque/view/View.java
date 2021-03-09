package co.edu.unbosque.view;

import javax.swing.*;

/**
 * @author David Lopez , Jorge Ramirez
 */

public class View {

    /**
     * Metodo usado para mostrar mensajes con el usuario
     *
     * @param mensaje Mensaje a mostrar
     */

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Metodo encargado de capturar un numero entero
     *
     * @param mensaje Mensaje que va a acompañar el JOptionPane.showInputDialog para solicitar datos
     * @return Entero que es el mensaje capturado
     */

    public int caputrarDatoNumerico(String mensaje) {
        String r = JOptionPane.showInputDialog(null, mensaje);
        int a = 0;
        if (!esNumeroInt(r)) {
            caputrarDatoNumerico(mensaje);
        } else {
            a = Integer.parseInt(r);
        }
        return a;
    }

    /**
     * Metodo  encargado de capturar un numero real
     *
     * @param mensaje que va a acompañar el JOptionPane.showInputDialog para solicitar datos
     * @return Double que es el mensaje capturado
     */
    public Double capturarDatoNumerico(String mensaje) {
        String r = JOptionPane.showInputDialog(null, mensaje);
        Double a = 0.0;
        if (!esNumeroDouble(r)) {
            caputrarDatoNumerico(mensaje);
        } else {
            a = Double.parseDouble(r);
        }
        return a;
    }

    /**
     * Metodo que nos determina si el contenido de un string se puede pasar a un double
     *
     * @param mensanje variable a evaluar contenido
     * @return booleano que nos indica si el contenido del Strign mensaje en una variable Double
     */
    private boolean esNumeroDouble(String mensanje) {
        try {
            Double.parseDouble(mensanje);
            mostrarMensaje("Dato ingresado con exito");
            return true;
        } catch (NumberFormatException nfe) {
            mostrarMensaje("Ingrese dato valido (decimales)");
            return false;
        }

    }

    /**
     * Metodo que nos determina si el contenido de un string se puede pasar a un int
     *
     * @return booleano que nos indica si el contenido del Strign mensaje en una variable int
     */

    private boolean esNumeroInt(String mensaje) {
        try {
            Integer.parseInt(mensaje);
            mostrarMensaje("Dato ingresado con exito");
            return true;
        } catch (NumberFormatException nfe) {
            mostrarMensaje("Ingrese un dato númerico");
            return false;
        }
    }


    /**
     * Metodo encargado de mostrar el menu de bienvenid
     */

    public String menuPrincipal() {
        Object[] opciones = {"1. Pila Estatica", "2. Cola Dinamica", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "      ..:Bienvenido señor usuario :..                " + "\n\n\nSelecciona un operacion a realizar:    ", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }

    /**
     * Metodo encargado de mostrar los meotodos que puede realizar una pila
     */

    public String menuPilaEstatica() {
        Object[] opciones = {"1. Agregar elemento a la pila", "2. LLenar pila con número aleatorios", "3. Remover elemento en la cima de la pila",
                "4. Optener número de elementos de la pila ", "5. Indicar si la pila esta llena", "6. Indicar si la pila esta vacia ", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "\nSelecciona un operacion a realizar:\n\n", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }


    /**
     * Metodo encargado de mostrar los meotodos que puede realizar una pila
     */


    public String menucola() {
        Object[] opciones = {"1. Agregar a la cola.", "2. Desencolar elemennto", "3. Obtener primer elemento de la cola ",
                "4. Optener número de elementos de la cola ", "5. Indicar si la cola esta llena", "6. Indicar si la cola esta vacia ", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "\nSelecciona un operacion a realizar:\n\n", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }
}


