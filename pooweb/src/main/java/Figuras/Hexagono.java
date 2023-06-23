package Figuras;

import java.util.*;

public class Hexagono extends Figura {
    private double lado;
    private double perimetro;
    private double apotema;

    public Hexagono() {
    }

    public Hexagono(double lado, double perimetro, double apotema) {
        super();
        this.perimetro = perimetro;
        this.lado = lado;
        this.apotema = apotema;
    }

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void registrar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor del lado de tu Hexagono");
        lado = leer.nextDouble();
        System.out.println("ingresa el valor del perimetro de tu hexagono");
        perimetro = leer.nextDouble();
        System.out.println(
                "ingrese el valor del apotema de su Hexagono(es la medida de la margen de una cara con respecto al centro)");
        apotema = leer.nextDouble();
    }

    public double calcularArea() {
        double area = (perimetro * apotema) / 2;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = lado * 6;
        return perimetro;
    }
}
