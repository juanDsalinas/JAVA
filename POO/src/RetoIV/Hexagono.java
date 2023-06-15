package RetoIV;

import java.util.*;

public class Hexagono extends Figura {
    private int lado;
    private int perimetro;
    private int apotema;

    public Hexagono() {
    }

    public Hexagono(int lado,int perimetro, int apotema) {
        super();
        this.perimetro = perimetro;
        this.lado = lado;
        this.apotema = apotema;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int aportema) {
        this.apotema = aportema;
    }

    public void registrar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor del lado de tu Hexagono");
        lado = leer.nextInt();
        System.out.println("ingresa el valor del perimetro de tu hexagono");
        perimetro = leer.nextInt();
        System.out.println("ingrese el valor del apotema de su Hexagono(es la medida de la margen de una cara con respecto al centro)");
        apotema = leer.nextInt();
    }

    public void calcularArea() {
        float area = (perimetro * apotema) / 2;
        System.out.println("el area del hexagono es: " + area);
    }
}
