package Retos;

import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        // declaro las variables e inicializo en cero las que van a almacenar el resultado de una operacion
        int number;
        String elec,elecU = "";
        // instancio la clase Scanner
        Scanner leer = new Scanner(System.in);
        // pido los datos necesarios al usuario, los parceo y los guardo en variables
        System.out.println("Elije ¿cara o sello?");
        elec = leer.nextLine();
        // con este metodo convierto todo lo que el usuario ingreso en minusculas
        elec.toLowerCase();
        // le doy un valor a la variable elecU dependiendo del caso seleccionado
        switch(elec){
            case "cara":
                System.out.println("elegiste cara");
                elecU = "cara";
            break;
            case "sello":
                System.out.println("elegiste sello");
                elecU = "sello";
            break;
        }

        // mensaje intermedio
        System.out.println("la moneda esta girando");

        // genero un numero aleatorio entre 0 y 1 con el objeto Math y su metodo random
        number = (int) (Math.random()*2);
        switch(number){
            case 0:
                elec = "cara";
                System.out.println("cayo cara");
            break;
            case 1:
                elec = "sello";
                System.out.println("cayo sello");
            break;
        }
        // comparo si la eleccion del usuario es igual a la de la maquina
        if (elec == elecU){
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste");
        }
        // limpiamos el buffer  
        leer.close();
    }
}
