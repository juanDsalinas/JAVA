package Retos;

import java.util.Scanner;

public class RetoVI {
    public static void main(String[] args) {
        // declaro las variables e inicializo en cero las que van a almacenar el resultado de una operacion
        int precio,total = 0,cantidad;
       boolean desici;
       // instanciamos la clase Scanner
       Scanner leer = new Scanner(System.in);
       // utilizamos un bucle do - while    
       do{         
            // pido los datos necesarios al usuario, los parceo y los guardo en variables
           System.out.println("¿cuantos productos deseas comprar?");
           cantidad = leer.nextInt();
            // utilizo un ciclo for    
           for (int i = 1; i <= cantidad; i++){
               System.out.println("¿cuanto cuesta el producto" + i + "?" );
               precio = leer.nextInt();
               System.out.println("el producto " + i + " cuesta " + precio + " pesos");
               total += precio;
           }
            // cuando se acabe el bucle muestro una serie de mensajes sobre la compra    
           System.out.println("el total de la compra es de " + total + " pesos");
           System.out.println("¿quieres volver a comprar? - no - false - true - si");
           desici = leer.nextBoolean();
       } while(desici == true);
        // limpiamos el buffer
       leer.close();
    }
}