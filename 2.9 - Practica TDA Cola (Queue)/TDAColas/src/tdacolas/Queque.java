package tdacolas;


public class Queque {

    private Node front;
    private Node rear;

    public Queque() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        System.out.println("El elemento con numero " + data + " ha sido eliminado.");
    }

    public void front() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        System.out.println("El dato que se encuentra al frente de la cola es: " + front.getData());
    }

    public void size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        System.out.println("El numero de elementos en la cola es de: " + count);
    }

    public boolean isEmpty() {
        return front == null;
    }

}
