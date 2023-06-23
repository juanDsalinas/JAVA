package Figuras;

import java.util.*;

public class Circulo extends Figura {
    private double radio;
    private double pi = 3.1416;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void registrar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("indica el valor del radio de tu circulo");
        this.radio = leer.nextDouble();
    }

    public double calcularArea() {
        double area = Math.floor((pi * (radio * radio)));
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = (radio * (pi * pi));
        return perimetro;
    }

}
