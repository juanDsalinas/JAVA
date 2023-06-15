package Introduccion;

import java.util.*;

public class Elemento {
    // atributos
    private int numeroDeElectrones;
    private int numeroAtomico;
    private double masaAtomica;

    // metodo constructor
    public Elemento() {
    }

    public Elemento(int numeroDeElectrones, int numeroAtomico, double masaAtomica) {
        this.numeroDeElectrones = numeroDeElectrones;
        this.numeroAtomico = numeroAtomico;
        this.masaAtomica = masaAtomica;
    }

    // metodos accesores
    public int getNumeroDeElectrones() {
        return numeroDeElectrones;
    }

    public void setNumeroDeElectrones(int numeroDeElectrones) {
        this.numeroDeElectrones = numeroDeElectrones;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public double getMasaAtomica() {
        return masaAtomica;
    }

    public void setMasaAtomica(double masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    // METODOS
    public void registrarElemento() {
        // instancia de la clase Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el numero de electrones");
        numeroDeElectrones = leer.nextInt();
        System.out.println("digite el numero Atomico del elemento");
        numeroAtomico = leer.nextInt();
        System.out.println("digite la masa atomica del elemento");
        masaAtomica = leer.nextInt();
        leer.close();
    }

    public void mostrarElemento() {
        System.out.println("tu elemento tiene " + numeroDeElectrones + " electrones");
        System.out.println("tu elemento tiene " + numeroAtomico + " electrones");
        System.out.println("tu elemento tiene " + masaAtomica + " electrones");
    }

    // parametros sin retorno
    public void calcularEdad(int año) {
        int actual, edad = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el año actual");
        actual = leer.nextInt();
        edad = actual - año;
        System.out.println("tienes " + edad + " años de edad");
        leer.close();
    }
}
