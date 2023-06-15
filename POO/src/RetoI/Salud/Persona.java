package RetoI.Salud;

import java.util.*;

public class Persona {
    // Atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private Double peso;
    private Double estatura;
    private int edad;
    private String sexo;

    // metodo constructor
    public Persona() {
    }

    // Metodos normales
    public void pedirDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite su tipo de documento");
        tipoDoc = leer.nextLine();
        System.out.println("digite su numero de documento");
        documento = leer.nextInt();
        leer.nextLine();
        System.out.println("digite su nombre");
        nombre = leer.nextLine();
        System.out.println("digite su apellido");
        apellido = leer.nextLine();
        System.out.println("digite su peso en Kg");
        peso = leer.nextDouble();
        System.out.println("digite su estatura en cm");
        estatura = leer.nextDouble();
        System.out.println("digite su edad cumplida en años");
        edad = leer.nextInt();
        leer.nextLine();
        System.out.println("digite su sexo siendo M para masculino y F para femenino");
        sexo = leer.nextLine();
        leer.close();
    }

    public void mostrarPersona() {
        System.out.println("su tipo de documento es: " + tipoDoc);
        System.out.println("su numero de documento es: " + documento);
        System.out.println("su nombre es: " + nombre);
        System.out.println("su apellido es: " + apellido);
        System.out.println("su peso en Kg es: " + peso);
        System.out.println("su altura en cm es: " + estatura);
        System.out.println("su edad cumplida en años es: " + edad);
        System.out.println("su tipo de sexo es: " + sexo);
    }

    public void iMC() {
        Double tot = (peso / (estatura * estatura));
        if (tot < 20) {
            System.out.println("tu indice de masa corporal es de: " + peso + " el peso está por debajo de lo ideal");
        } else if (tot >= 20 || peso <= 25) {
            System.out.println("tu indice de masa corporal es de: " + peso + " el peso es ideal");
        } else if (tot > 25) {
            System.out.println("tu indice de masa corporal es de: " + peso + " usted se encuentra en sobrepeso");
        }
    }

    public void age() {
        if (edad >= 18) {
            System.out.println("usted es mayor de edad");
        } else {
            System.out.println("usted es menor de edad");
        }
    }
}
