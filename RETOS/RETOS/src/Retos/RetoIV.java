package Retos;

import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        // declaro las variables e inicializo en cero las que van a almacenar el resultado de una operacion
        int numero, numero1;
        String manoM = "";
        String manoU = "";
        // instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);
        // hacemos que la maquina elija que quiere sacar mediante la generacion un numero aleatorio entre 0 y 2 con el objeto Math y su metodo random
        numero = (int)(Math.random() * 3);
        // le doy un valor a la variable manoM dependiendo del caso seleccionado
        switch (numero) {
            case 1:
                manoM = "piedra";
                // System.out.println("elegiste la piedra");
            break;
            case 2:
                manoM = "papel";
                // System.out.println("elegiste sacar papel");
            break;
            case 3:
                manoM = "tijeras";
                // System.out.println("elegiste sacar tijeras");
            break;
        }
        // ahora le toca al usuario elegir
        System.out.println("que deseas sacar : \n 1. piedra  2. papel  3. tijeras");
        numero1 = leer.nextInt();
        // le doy un valor a la variable manoU dependiendo del caso seleccionado
        switch (numero1) {
            case 1:
                manoU = "piedra";
                System.out.println("elegiste la piedra");
            break;
            case 2:
                manoU = "papel";
                System.out.println("elegiste sacar papel");
            break;
            case 3:
                manoU = "tijeras";
                System.out.println("elegiste sacar tijeras");
            break;
        }
        
        // comparo todos los posible resultados entre la eleccion del usuario y la de la maquina 
        if (manoU.equalsIgnoreCase("piedra") && manoM.equalsIgnoreCase("tijeras")){
            System.out.println(" el usuario gana");
        } else if (manoU.equalsIgnoreCase("papel") && manoM.equalsIgnoreCase("piedra")){
            System.out.println(" el usuario gana");
        } else if (manoU.equalsIgnoreCase("tijeras") && manoM.equalsIgnoreCase("papel")){
            System.out.println(" el usuario gana");
        } else if (manoU.equalsIgnoreCase("papel") && manoM.equalsIgnoreCase("papel")){
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (manoU.equalsIgnoreCase("piedra") && manoM.equalsIgnoreCase("piedra")){
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (manoU.equalsIgnoreCase("tijeras") && manoM.equalsIgnoreCase("tijeras")){
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (manoU.equalsIgnoreCase("piedra") && manoM.equalsIgnoreCase("papel")){
            System.out.println(" la maquina gana");
        } else if (manoU.equalsIgnoreCase("tijeras") && manoM.equalsIgnoreCase("piedra")){
            System.out.println(" la maquina gana");
        } else if (manoU.equalsIgnoreCase("papel") && manoM.equalsIgnoreCase("tijeras")){
            System.out.println(" la maquina gana");
        } else {
            System.out.println("Ocurrio un error");
        }
        // limpiamos el buffer
        leer.close();
    }
}
