package Figuras;

import java.util.*;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado;

    public Triangulo() {
    }

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public Triangulo(double base, double altura) {
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
        System.out.println("ingrese la base");
        this.base = leer.nextDouble();
        System.out.println("ingrese la altura");
        this.altura = leer.nextDouble();
    }

    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = lado * 3;
        return perimetro;
    }

}
