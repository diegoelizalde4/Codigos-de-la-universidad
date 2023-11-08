package LSL;

public class Lista {
    public Nodo inicio;

    public Lista() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo;
        if (estaVacia()) {
            nuevo = new Nodo(dato, null);
            inicio = nuevo;
        } else {
            nuevo = new Nodo(dato, null);
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertarFinal(int dato) {
        Nodo nuevo;
        if (estaVacia()) {
            nuevo = new Nodo(dato, null);
            inicio = nuevo;
        } else {
            nuevo = new Nodo(dato, null);
            Nodo temporal = inicio;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
        }
    }

    public void insertarEnMedio(int despues, int dato) {
        if (inicio == null || inicio.getSiguiente() == null) {
            System.out.println("No se pueden insertar en medio con menos de 2 nodos.");
        } else {
            Nodo nuevo = new Nodo(dato, null);
            Nodo temporal = inicio;
            while (temporal != null) {
                if (temporal.getDato() == despues) {
                    nuevo.setSiguiente(temporal.getSiguiente());
                    temporal.setSiguiente(nuevo);
                    return;
                }
                temporal = temporal.getSiguiente();
            }
            System.out.println("No se encontró el valor '" + despues + "' en la lista.");
        }
    }

    public void eliminarInicio() {
        if (estaVacia()) {
            System.out.print("La lista se encuentra vacía.");
        } else {
            inicio = inicio.getSiguiente();
        }
    }

    public void eliminarFinal() {
        if (estaVacia()) {
            System.out.print("La lista se encuentra vacía.");
        } else if (inicio.getSiguiente() == null) {
            inicio = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.getSiguiente().getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(null);
        }
    }

    public void eliminarEnMedio(int despues) {
        if (inicio == null || inicio.getSiguiente() == null) {
            System.out.println("No se pueden eliminar en medio con menos de 2 nodos.");
        } else {
            Nodo temporal = inicio;
            while (temporal.getSiguiente() != null) {
                if (temporal.getSiguiente().getDato() == despues) {
                    temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
                    return;
                }
                temporal = temporal.getSiguiente();
            }
            System.out.println("No se encontró el valor '" + despues + "' en la lista.");
        }
    }

    public int contarNodos() {
        int contador = 0;
        Nodo temporal = inicio;
        while (temporal != null) {
            contador++;
            temporal = temporal.getSiguiente();
        }
        return contador;
    }

    public void mostrar() {
        Nodo temporal = inicio;
        if (estaVacia()) {
            System.out.println("La lista se encuentra vacía.");
        } else {
            System.out.println("Contenido de la lista:");
            while (temporal != null) {
                System.out.println(" " + temporal.getDato());
                temporal = temporal.getSiguiente();
            }
        }
    }
}
