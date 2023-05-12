package Retos;

import java.util.Scanner;

public class RetoVI {
    public static void main(String[] args) {
        // declaramos las variables
        int numero, numero1;
        String manoM = "";
        String manoU = "";
        boolean desici = true;
        // instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);

        // creamos un while
        while (desici == true){

        // hacemos que la maquina elija que quiere sacar
        numero = (int)(Math.random() * 3);
        switch (numero) {
            case 0:
                manoM = "piedra";
                // System.out.println("elegiste la piedra");
            break;
            case 1:
                manoM = "papel";
                // System.out.println("elegiste sacar papel");
            break;
            case 2:
                manoM = "tijeras";
                // System.out.println("elegiste sacar tijeras");
            break;
        }
        // ahora le toca al humano elegir
        System.out.println("que deseas sacar : \n 1. piedra  2. papel  3. tijeras");
        numero1 = leer.nextInt();
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

        System.out.println("¿deseas seguir jugando? true - si o false - no");
        desici = leer.nextBoolean();
    }

        leer.close();
    }
}
