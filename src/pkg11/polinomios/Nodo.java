package pkg11.polinomios;

public class Nodo {

    double coeficiente;
    int exponente;
    Nodo siguiente;

    public Nodo() {
        coeficiente = 0;
        exponente = 0;
        siguiente = null;
    }

    public Nodo(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        siguiente = null;
    }

    public void actualizar(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return "Contenido del nodo: " + coeficiente + " Exp: " + exponente;
    }
}
