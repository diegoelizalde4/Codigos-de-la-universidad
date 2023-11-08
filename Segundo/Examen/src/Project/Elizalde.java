package Project;

public class Elizalde {
    private DAEO inicio;    
    public Elizalde() {
        inicio = null;
    }
    public boolean estaVacia() {
        return inicio == null;
    }
    public void insertar(int coeficiente, int literal, int exponente) {
        DAEO nuevo = new DAEO(coeficiente, literal, exponente);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            DAEO aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public void mostrar() {
        if (!estaVacia()) {
            DAEO aux = inicio;
            while (aux != null) {
                System.out.print(aux.getCoeficiente() + "x" + aux.getLiteral() + "^" + aux.getExponente() + " + ");
                aux = aux.getSiguiente();
            }
            System.out.println("");
        }
    }
    
}
