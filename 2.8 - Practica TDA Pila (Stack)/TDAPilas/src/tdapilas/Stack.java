
package tdapilas;

import javax.swing.JOptionPane;


public class Stack {

    private int size;
    private Node start;

    public Stack() {
        start = null;
        size = 0;
    }

    public void push(int data) {
        System.out.println("Insertando un nuevo elemento en la pila...");
        Node newNode = new Node(data);
        newNode.setNext(start);
        start = newNode;
        size++;
    }

    public void pop() {
        int value = start.getData();
        start = start.getNext();
        System.out.println("Valor eliminado de la Pila:" + value);
        size--;
    }

    public void peek() {
        JOptionPane.showMessageDialog(null, "El ultimo elemento agregado a la pila es: " + start.getData(), "Ultimo Agregado", JOptionPane.INFORMATION_MESSAGE);
    }

    public void size() {
        JOptionPane.showMessageDialog(null, "El numero de elementos que hay en la pila es de: " + size, "Numero De Elementos", JOptionPane.INFORMATION_MESSAGE);        
    }

}
