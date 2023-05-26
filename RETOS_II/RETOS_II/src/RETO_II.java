import java.util.*;
public class RETO_II {
    public static void main(String[] args) {
        int n,temp;
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantos competidores son :");
        n = leer.nextInt();
        leer.nextLine();
        // dos array, uno para los nombres y otro para los tiempos
        String [] competidor = new String [n];
        int [] time = new int [n];
        // rellenamos el array de los nombres
        for(int i=0; i < competidor.length; i++){
            System.out.println("digite el nombre del competidor " + i);
            competidor[i] = leer.nextLine();
        }
        // rellenamos el array de los tiempos
        for(int i=0; i < competidor.length; i++){
            System.out.println("digite el tiempo del competidor " + competidor[i] + " en segundos");
            time[i] = leer.nextInt();
        }
        // mostramos las posiciones para los dos arrays
        for(int i=0; i < competidor.length; i++){
            System.out.println("the name of the competidor " + i + " is " + competidor[i] + " and her time is " + time[i]);
        }

        // determinar el ganador organizandolos de mayor a menor
        for (int j=0; j < competidor.length; j++){
            for (int i=0; i < competidor.length; i++){
                if (i + 1 == competidor.length){
                    break;
                } else if (time[i] < time[i + 1]){
                    temp = time[i];
                    time[i] = time[i + 1];
                    time[i + 1] = temp;                   
                } 
            }
        }

        // elegimos la ultima posicion del array ya que lo organizamos de mayor a menor y el menor es el ganador
        for(int i=1; i <= time.length; i++){
            if (i == time.length){
                // i -- ya que como i se pasa del limite del array se sale y nos genera error, en
                // cambio con el i-- nos devolvemos hasta la ultima posicion
                i--;
                if (time[i] > 0){
                    System.out.println("el ganador es " + competidor[i] + " con su increible tiempo de " + time[i] + " segundos");
                }
                break;
            }
        }

        leer.close();
    }
}
