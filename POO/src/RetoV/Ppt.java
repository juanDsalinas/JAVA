package RetoV;

import java.util.*;

public class Ppt implements Juego {
    private String nombre;
    private String eleccionU;
    private String eleccionM;

    public Ppt() {
    }

    public Ppt(String nombre, String eleccionU, String eleccionM) {
        this.nombre = nombre;
        this.eleccionU = eleccionU;
        this.eleccionM = eleccionM;
    }

    Scanner leer = new Scanner(System.in);

    public void iniciar() {
        System.out.println("por favor digite su nombre");
        this.nombre = leer.nextLine();
    }

    public void jugar() {
        System.out.println("por favor indique que desea sacar - piedra - papel - tijeras");
        this.eleccionU = leer.nextLine();
        int numero = (int) Math.random() * 3;
        switch (numero) {
            case 0:
                eleccionM = "piedra";
                // System.out.println("elegiste la piedra");
                break;
            case 1:
                eleccionM = "papel";
                // System.out.println("elegiste sacar papel");
                break;
            case 2:
                eleccionM = "tijeras";
                // System.out.println("elegiste sacar tijeras");
                break;
        }
    }

    public void finalizar() {
        if (eleccionU.equalsIgnoreCase("piedra") && eleccionM.equalsIgnoreCase("tijeras")) {
            System.out.println(" el usuario gana");
        } else if (eleccionU.equalsIgnoreCase("papel") && eleccionM.equalsIgnoreCase("piedra")) {
            System.out.println(" el usuario gana");
        } else if (eleccionU.equalsIgnoreCase("tijeras") && eleccionM.equalsIgnoreCase("papel")) {
            System.out.println(" el usuario gana");
        } else if (eleccionU.equalsIgnoreCase("papel") && eleccionM.equalsIgnoreCase("papel")) {
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (eleccionU.equalsIgnoreCase("piedra") && eleccionM.equalsIgnoreCase("piedra")) {
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (eleccionU.equalsIgnoreCase("tijeras") && eleccionM.equalsIgnoreCase("tijeras")) {
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (eleccionU.equalsIgnoreCase("piedra") && eleccionM.equalsIgnoreCase("papel")) {
            System.out.println(" la maquina gana");
        } else if (eleccionU.equalsIgnoreCase("tijeras") && eleccionM.equalsIgnoreCase("piedra")) {
            System.out.println(" la maquina gana");
        } else if (eleccionU.equalsIgnoreCase("papel") && eleccionM.equalsIgnoreCase("tijeras")) {
            System.out.println(" la maquina gana");
        } else {
            System.out.println("Ocurrio un error");
        }
    }
}
