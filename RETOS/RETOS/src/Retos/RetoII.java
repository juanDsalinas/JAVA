package Retos;
import java.util.Scanner;
// import java.text.DecimalFormat;

public class RetoII {
    public static void main(String[] args) {
        // declaro las variables e inicializo en cero las que van a almacenar el resultado de una operacion
        String nombreBebe, nombreEnfermera,nombrePadre;
        double pesoBebe, edadBebe, dosisVacuna = 0;
        // pido los datos necesarios al usuario, los parceo y los guardo en variables
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el nombre del bebe");
        nombreBebe = lectura.nextLine();
        System.out.println("Ingrese el nombre de la Enfermera");
        nombreEnfermera = lectura.nextLine();
        System.out.println("Ingrese el nombre del padre");
        nombrePadre = lectura.nextLine();
        System.out.println("Ingrese el peso del bebe en Kg");
        pesoBebe = lectura.nextDouble();
        System.out.println("Ingrese la edad del bebe en meses");
        edadBebe = lectura.nextDouble();
        // resuelvo la formula necesaria para dar solucion al problema
        dosisVacuna = ((pesoBebe + 10) / (edadBebe * 10)) * 8;
        // mostramos el resultado
        System.out.println(nombreBebe + " fue traid@ por " + nombrePadre + " para aplicarle " + dosisVacuna + " ml de la vacuna, esta fue suministrada por " + nombreEnfermera);
        // limpiamos el buffer  
        lectura.close();
    }
}