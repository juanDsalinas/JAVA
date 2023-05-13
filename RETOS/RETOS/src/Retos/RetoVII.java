package Retos;
import java.util.Scanner;
public class RetoVII {
    public static void main(String[] args) {
        // declaro las variables e inicializo en cero las que van a almacenar el resultado de una operacion
        int number;
        String elec,elecU = "";
        int Cantpost, CantFinal = 0,games = 0;
        boolean desici = true;
        // instancio la clase Scanner
        Scanner leer = new Scanner(System.in);
        // utilizo un ciclo while
        while (desici == true){
            // pido los datos necesarios al usuario, los parceo y los guardo en variables
            System.out.println("¿cuanto deseas apostar?");
            Cantpost = leer.nextInt();
        
        leer.nextLine();
        System.out.println("Elije ¿cara o sello?");
        elec = leer.nextLine();
        // con este metodo convierto todo lo que el usuario ingreso en minusculas
        elec.toLowerCase();
        // le doy un valor a la variable elecU dependiendo del caso seleccionado
        switch(elec){
            case "cara":
                System.out.println("elegiste cara");
                elecU = "cara";
            break;
            case "sello":
                System.out.println("elegiste sello");
                elecU = "sello";
            break;
        }

        // mensaje intermedio
        System.out.println("la moneda esta girando");

        // genero un numero aleatorio entre 0 y 2 con el objeto Math y su metodo random
        number = (int) (Math.random()*2);
        switch(number){
            case 0:
                elec = "cara";
                System.out.println("cayo cara");
            break;
            case 1:
                elec = "sello";
                System.out.println("cayo sello");
            break;
        }
        
        // comparo si la eleccion del usuario es igual a la de la maquina
        if (elec == elecU){
            System.out.println("ganaste " + Cantpost);
            System.out.println("ahora tienes " + (CantFinal += Cantpost));
        } else {
            System.out.println("perdiste");
            System.out.println("ahora tienes" + (CantFinal -= Cantpost));
        }
        // con cada iteracion voy sumando el numero de iteraciones que se realizaron
        games++;
        // muestro el numero de partidas jugadas
        System.out.println("llevas jugadas " + games + "partidas");
        // pido los datos necesarios al usuario, los parceo y los guardo en variables
        System.out.println("¿deseas seguir jugando? - true - si - false - no");
        desici = leer.nextBoolean();
        }
        // limpiamos el buffer 
        leer.close();
    }
}