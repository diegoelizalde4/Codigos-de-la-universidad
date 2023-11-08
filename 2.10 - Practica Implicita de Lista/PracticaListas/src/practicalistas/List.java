
package practicalistas;

public class List {

    private Node start;
    private int number;

    public List() {
        this.start = null;
        this.number = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void addToQueue(String name) {
        number = 1;

        Node newNode = new Node(number, name);

        if (isEmpty()) {
            start = newNode;
        } else if (name.compareTo(start.getName()) < 0) {
            newNode.setNext(start);
            start = newNode;
        } else {
            Node current = start;
            Node before = null;
            while (current != null && name.compareTo(current.getName()) > 0) {
                before = current;
                current = current.getNext();
                number++;
            }
            if (current == null || name.compareTo(current.getName()) != 0) {
                newNode.setNumber(number);
                if (before != null) {
                    newNode.setNext(current);
                    before.setNext(newNode);
                } else {
                    newNode.setNext(current);
                    start = newNode;
                }
            }
        }
    }

    public void showQueue() {
        if (number == 0) {
            System.out.println("No hay nombres existentes en la lista");
        }
        Node current = start;
        while (current != null) {
            System.out.println("Número: " + current.getNumber() + ", Nombre: " + current.getName());
            current = current.getNext();
            start = start.getNext();
        }
        start = null;
        number = 0;
    }
}
