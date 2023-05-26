import java.util.*;
public class RETO_I {
    public static void main(String[] args) {
        int n,prom = 0;
        Scanner leer = new Scanner (System.in);
        System.out.println("cuantas notas vas a evaluar");
        n = leer.nextInt();
        int [] notas = new int [n];
        // ingresamos las notas al array
        for (int i=0; i < notas.length; i++){
            notas[i] = leer.nextInt();
        }
        // las sumamos
        for (int  i=0; i< notas.length; i++){
            prom += notas[i];    
        }
        // Las promediamos
        prom = prom / n;
        System.out.println("el promedio de las notas es de : " + prom);

        // dependiendo del promedio se le asigna un estado
        if (prom < 3) {
            System.out.println("Reprobaste la materia");
        } else if (prom >= 3 && prom <=4) {
            System.out.println("Pasaste raspando");
        } else if (prom >  4) {
            System.out.println("Aprobaste con buenos resultados");
        } 
        // limpiamos el buffer
        leer.close();
    }
}
