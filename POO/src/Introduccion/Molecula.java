package Introduccion;

import java.util.Scanner;

public class Molecula extends Elemento {
    private String estadoN;
    private String nombreMolecula;

    public Molecula() {
    }

    public Molecula(String estadoN, int numeroDeElectrones, int numeroAtomico, double masaAtomica) {
        super(numeroDeElectrones, numeroAtomico, masaAtomica);
        this.estadoN = estadoN;
    }

    public void registrar() {
        Scanner leer = new Scanner(System.in);
        int rep;
        double rip;
        System.out.println("estado - Liquido, solido, gaseoso");
        estadoN = leer.nextLine();
        System.out.println("numero electrones");
        rep = leer.nextInt();
        setNumeroDeElectrones(rep);
        System.out.println("nombre de la molecula");
        leer.nextLine();
        nombreMolecula = leer.nextLine();
        System.out.println("numero electrones");
        rep = leer.nextInt();
        setNumeroDeElectrones(rep);
        System.out.println("numero atomico");
        rep = leer.nextInt();
        setNumeroAtomico(rep);
        System.out.println("masa atomica");
        rip = leer.nextInt();
        setMasaAtomica(rip);
        leer.close();
    }

    public void mostrar() {
        System.out.println(" el elemento " + nombreMolecula + " se compone de " + getMasaAtomica()
                + " de masa atomica, se encuentra en estado "
                + estadoN + " y contiene " + getNumeroDeElectrones() + " electrones");
    }
}
