package Project;

public class DAEO {
    private int coeficiente;
    private int literal;
    private int exponente;
    private DAEO siguiente;

    public DAEO(int coeficiente, int literal, int exponente, DAEO siguiente) {
        this.coeficiente = coeficiente;
        this.literal = literal;
        this.exponente = exponente;
        this.siguiente = null;
        this.siguiente = siguiente;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getLiteral() {
        return literal;
    }

    public void setLiteral(int literal) {
        this.literal = literal;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public DAEO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(DAEO siguiente) {
        this.siguiente = siguiente;
    }
    

}
