package Introduccion;

public class Calculadora {
    private double n1;
    private double n2;

    // metodo constructor
    public Calculadora() {
    }
    // sobrecarga
    public Calculadora(double _n1, double _n2) {
        n1 = _n1;
        n2 = _n2;
    }

    // metodos getters y setters
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    

    public double sumar(double n1, double n2) {
        Double sum = 0.0;
        return sum = n1 + n2;
    }

    public double sumar() {
        Double sum = 0.0;
        return sum = this.n1 + this.n2;
    }

    public double restar(double n1, double n2) {
        Double res = 0.0;
        return res = n1 - n2;
    }

    public double multi(double n1, double n2) {
        Double mult = 0.0;
        return mult = n1 * n2;
    }

    public double dividir(double n1, double n2) {
        Double div = 0.0;
        return div = n1 / n2;
    }
}
