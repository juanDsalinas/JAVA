package Introduccion;

import java.util.Scanner;

public class Caraysello {
    private int moneda;
    private String jugador;
    private int eleccion;

    public Caraysello() {
    }

    public Caraysello(int moneda, String jugador, int eleccion) {
        this.eleccion = eleccion;
        this.moneda = moneda;
        this.jugador = jugador;
    }

    Scanner leer = new Scanner(System.in);

    public void iniciar() {
        System.out.println("name del jugador");
        jugador = leer.nextLine();
    }

    public void jugar() {
        System.out.println("digite su eleccion - 0. cara - 1. sello");
        eleccion = leer.nextInt();
        int random = (int) Math.random() * 2;
        if (random == eleccion) {
            eleccion = 1;
        } else {
            eleccion = 2;
        }

    }

    public void finalizar() {
        if (eleccion == 1) {
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste");
        }
    }
}
