package Figuras;

import java.util.*;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void registrar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("por favor digite la base de su rectangulo");
        this.base = leer.nextDouble();
        System.out.println("por favor digite la medida de la altura de su rectangulo");
        this.altura = leer.nextDouble();
    }

    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }
}
