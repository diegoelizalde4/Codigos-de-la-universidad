
package practicalistas;

public class Node {

    private int number;
    private String name;
    private Node next;

    public Node(int numero, String name) {
        this.number = numero;
        this.name = name;
        this.next = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
}
