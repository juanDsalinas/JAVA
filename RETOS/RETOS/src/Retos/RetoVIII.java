package Retos;

import java.util.Scanner;

public class RetoVIII {
    public static void main(String[] args) {
        // declaramos las variables
        int precio,total = 0,cantidad;
        boolean desici;
        // instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);
        do{ 
            System.out.println("¿cuantos productos deseas comprar?");
            cantidad = leer.nextInt();
            for (int i = 1; i <= cantidad; i++){
                System.out.println("¿cuanto cuesta el producto" + i + "?" );
                precio = leer.nextInt();
                System.out.println("el producto " + i + " cuesta " + precio + " pesos");
                total += precio;
            }
            System.out.println("el total de la compra es de " + total + " pesos");
            System.out.println("¿quieres volver a comprar? - no - false - true - si");
            desici = leer.nextBoolean();
        } while(desici == true);

        leer.close();
    }
}
