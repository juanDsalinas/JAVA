package Retos;

import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        int number;
        String elec,elecU = "";        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Elije ¿cara o sello?");
        elec = leer.nextLine();
        elec.toLowerCase();
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

        // giro de la moneda
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

        if (elec == elecU){
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste");
        }

        leer.close();
    }
}
