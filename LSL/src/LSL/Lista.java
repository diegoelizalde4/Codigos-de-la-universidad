package LSL;

import javax.swing.JOptionPane;

public class Lista {
    public Nodo inicio;

    public Lista() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            inicio = nuevo;
            nuevo.setSiguiente(inicio);
        } else {
            Nodo temporal = inicio;
            while (temporal.getSiguiente() != inicio) {
                temporal = temporal.getSiguiente();
            }
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            temporal.setSiguiente(inicio);
        }
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            inicio = nuevo;
            nuevo.setSiguiente(inicio);
        } else {
            Nodo temporal = inicio;
            while (temporal.getSiguiente() != inicio) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
    }

    public void insertarEnMedio(int despues, int dato) {
        if (estaVacia()) {
            System.out.println("No se pueden insertar en medio en una lista vacía.");
            return;
        }
        Nodo nuevo = new Nodo(dato);
        Nodo temporal = inicio;
        do {
            if (temporal.getDato() == despues) {
                nuevo.setSiguiente(temporal.getSiguiente());
                temporal.setSiguiente(nuevo);
                return;
            }
            temporal = temporal.getSiguiente();
        } while (temporal != inicio);
        System.out.println("No se encontró el valor '" + despues + "' en la lista.");
    }

    public void eliminarInicio() {
        if (estaVacia()) {
            System.out.println("La lista se encuentra vacía.");
            return;
        }
        if (inicio.getSiguiente() == inicio) {
            inicio = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.getSiguiente() != inicio) {
                temporal = temporal.getSiguiente();
            }
            inicio = inicio.getSiguiente();
            temporal.setSiguiente(inicio);
        }
    }

    public void eliminarFinal() {
        if (estaVacia()) {
            System.out.println("La lista se encuentra vacía.");
            return;
        }
        if (inicio.getSiguiente() == inicio) {
            inicio = null;
        } else {
            Nodo temp1 = inicio;
            Nodo temp2 = null;
            while (temp1.getSiguiente() != inicio) {
                temp2 = temp1;
                temp1 = temp1.getSiguiente();
            }
            temp2.setSiguiente(inicio);
        }
    }

    public void eliminarEnMedio(int despues) {
        if (estaVacia()) {
            System.out.println("No se pueden eliminar en medio en una lista vacía.");
            return;
        }
        Nodo temporal = inicio;
        do {
            if (temporal.getDato() == despues) {
                temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
                return;
            }
            temporal = temporal.getSiguiente();
        } while (temporal != inicio);
        System.out.println("No se encontró el valor '" + despues + "' en la lista.");
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La lista se encuentra vacía.");
            return;
        }
        Nodo temporal = inicio;
        do {
            System.out.println(temporal.getDato());
            temporal = temporal.getSiguiente();
        } while (temporal != inicio);
        System.out.println( inicio.getDato());
    }

    public void encontrarElemento(int dato) {
        if (estaVacia()) {
            System.out.println("La lista se encuentra vacía.");
            return;
        }
        Nodo temporal = inicio;
        int contador = 1;
        do {
            if (temporal.getDato() == dato) {
                System.out.println("El elemento " + dato + " se encuentra en la posición " + contador);
                return;
            }
            temporal = temporal.getSiguiente();
            contador++;
        } while (temporal != inicio);
        System.out.println("Elemento no encontrado.");
    }
}