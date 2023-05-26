import java.util.*;

public class RETO_V {
    public static void main(String[] args) {
        // declaramos las variables e inicializamos algunas
        int n, m, cont=0,cont1=0;
        String desici = "si";
        // instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);
        // declaramos las dos matrices que vamos a utilizar
        int[][] sensation = new int[4][4];

        // rellenar la matriz sensation
        sensation[0][0] = 1;
        sensation[0][1] = 2;
        sensation[0][2] = 3;
        sensation[0][3] = 8;
        sensation[1][0] = 8;
        sensation[1][1] = 1;
        sensation[1][2] = 2;
        sensation[1][3] = 4;
        sensation[2][0] = 7;
        sensation[2][1] = 7;
        sensation[2][2] = 3;
        sensation[2][3] = 6;
        sensation[3][0] = 5;
        sensation[3][1] = 6;
        sensation[3][2] = 5;
        sensation[3][3] = 4;

        do {
            // preguntamos la primera posicion
            System.out.println("elije las primeras posiciones");
            System.out.println("que fila desea elegir");
            n = leer.nextInt();
            System.out.println("que columna desea elegir");
            m = leer.nextInt();
            // recorremos la matriz para encontrar las posibles coincidencias
            for(int filas=0; filas < 4; filas++){
                for(int columnas=0; columnas < 4; columnas++){
                    if(n == columnas && m == filas){
                            System.out.println("el numero en esa posicion es " + sensation[columnas][filas]);
                            cont = sensation[columnas][filas];
                    }
                }
            }


            // preguntamos la segunda posicion
            System.out.println("elije las segundas posiciones");
            System.out.println("que fila desea elegir");
            n = leer.nextInt();
            System.out.println("que columna desea elegir");
            m = leer.nextInt();
            // recorremos el array para encontrar las posibles coincidencias
            for(int filas=0; filas < 4; filas++){
                for(int columnas=0; columnas < 4; columnas++){
                    if(n == columnas && m == filas){
                            System.out.println("el numero en esa posicion es " + sensation[columnas][filas]);
                            cont1 = sensation[columnas][filas];
                    }
                }
            }

            // comparamos el valor de las posiciones elegidas
            if(cont == cont1){
                System.out.println("felicidades, encontraste un par");
                cont=0;
                cont1=0;
            } else {
                System.out.println("los numeros " + cont + " y " + cont1 + " no son iguales");
            }
            // preguntamos si el usuario desea volver a jugar
            leer.nextLine();
            System.out.println("deseas seguir jugando");
            desici = leer.nextLine();

        } while(desici.equalsIgnoreCase("si"));
        
        // limpiamos el buffer
        leer.close();
    }
}
