import java.util.*;

public class RETO_IV {
    public static void main(String[] args) {
        // instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);
        // filas - columnas
        // declaramos e inicializamos el matriz
        String[][] candys = new String[5][9];
        // filas - columnas
        // rellenamos el matriz manualmente
        candys[0][0] = "";
        candys[1][0] = "1";
        candys[2][0] = "";
        candys[3][0] = "2";
        candys[4][0] = "";

        candys[0][1] = "A";
        candys[0][2] = "B";
        candys[0][3] = "C";
        candys[0][4] = "D";
        candys[0][5] = "E";
        candys[0][6] = "F";
        candys[0][7] = "G";
        candys[0][8] = "H";
        candys[0][8] = "I";

        // recorremos la matriz y dependiendo de la fila rellanamos el nombre del producto o su precio
        for (int filas = 1; filas < 5; filas++) {
            for (int columnas = 1; columnas < 9; columnas++) {
                if (filas == 1 || filas == 3 || filas == 5) {
                    System.out.println("name of product");
                    candys[filas][columnas] = leer.nextLine();
                } else {
                    System.out.println("price of product");
                    candys[filas][columnas] = leer.nextLine();
                }
            }
            System.out.println(" ");
        }

        // mostramos la matriz y la mostramoss
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 9; columnas++) {
                System.out.print(candys[filas][columnas] + "\t");
            }
            System.out.println(" ");
        }
        leer.close();
    }
}
