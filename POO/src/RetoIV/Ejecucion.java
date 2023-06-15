package RetoIV;

import java.util.*;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int number = 1,elec;
        do {
            System.out.println("Bienvenido, por favor indique cual de las siguiente figuras desea sacar el area: \n 1 - Hexagono - 2 - triangulo - 3 - circulo - 4 - rectangulo");
            elec = leer.nextInt();
            switch(elec){
                case 1: 
                    System.out.println("elegiste el Hexagono");
                    Hexagono one = new Hexagono();
                    one.registrar();
                    one.calcularArea();
                break;
                case 2:
                    System.out.println("elegiste el triangulo");
                    Triangulo two = new Triangulo();
                    two.registrar();
                    two.calcularArea();
                break;
                case 3:
                    System.out.println("elegiste el circulo");
                    Circulo tre = new Circulo();
                    tre.registrar();
                    tre.calcularArea();
                break;
                case 4:
                    System.out.println("elegiste el rectangulo");
                    Rectangulo fur = new Rectangulo();
                    fur.registrar();
                    fur.calcularArea();
                break;
            }
            System.out.println("¿deseas seguir? - 1 - si - 2 - no");
            number = leer.nextInt();
        } while(number == 1);

        leer.close();
    }
}
