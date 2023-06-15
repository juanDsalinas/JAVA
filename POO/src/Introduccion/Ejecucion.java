package Introduccion;

import java.util.*;

public class Ejecucion {
    public static void main(String[] args) {
        // int res = 0;
        // System.out.println("ingrese masa atomica de la molecula");
        // res = leer.nextInt();
        Scanner leer = new Scanner(System.in);
        // clase Elemento
        // Elemento h20 = new Elemento();
        // h20.registrarElemento();
        // System.out.println(h20.getMasaAtomica());
        // h20.setMasaAtomica(res);
        // h20.registrarElemento();
        // h20.mostrarElemento();
        // h20.calcularEdad(2006);

        // ----------------------------------------------------------------------------------------------------

        // Clase calculadora
        // Calculadora one = new Calculadora();
        // Calculadora two = new Calculadora(2, 3);
        // System.out.println("el resultado de la suma es: " + one.sumar(12, 3));
        // System.out.println("el resultado de la multiplicacion es: " + one.multi(12,
        // 3.4));
        // System.out.println("el resultado de la division es: " + one.dividir(12,
        // 3.4));
        // System.out.println("el resultado de la resta es: " + one.restar(12, 3.4));

        // System.out.println(two.sumar());

        // --------------------------- Herencia de la superclase elemento
        // Molecula hierro = new Molecula();
        // hierro.registrar();
        // hierro.mostrar();

        // implementacion de interfaces
        Caraysello uno = new Caraysello();
        uno.iniciar();
        uno.jugar();
        uno.finalizar();

    }
}
