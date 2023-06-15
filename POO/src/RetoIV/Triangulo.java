package RetoIV;

import java.util.*;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo() {
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

    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("el area de tu triangulo es de:" + area);
    }

}
