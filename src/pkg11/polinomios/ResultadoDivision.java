
package pkg11.polinomios;

public class ResultadoDivision {
    
    private Polinomio cociente;
    private Polinomio residuo;

    public ResultadoDivision(Polinomio cociente, Polinomio residuo) {
        this.cociente = cociente;
        this.residuo = residuo;
    }

    public Polinomio getCociente() {
        return cociente;
    }

    public Polinomio getResiduo() {
        return residuo;
    }
}
