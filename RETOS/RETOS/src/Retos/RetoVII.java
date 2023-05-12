package Retos;
import java.util.Scanner;
public class RetoVII {
    public static void main(String[] args) {
        int number;
        String elec,elecU = "";
        int Cantpost, CantFinal = 0,games = 0;
        boolean desici = true;
        Scanner leer = new Scanner(System.in);
        while (desici == true){
            System.out.println("¿cuanto deseas apostar?");
            Cantpost = leer.nextInt();
        
        leer.nextLine();
        System.out.println("Elije ¿cara o sello?");
        elec = leer.nextLine();
        elec.toLowerCase();
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

        // giro de la moneda
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

        if (elec == elecU){
            System.out.println("ganaste " + Cantpost);
            System.out.println("ahora tienes " + (CantFinal += Cantpost));
        } else {
            System.out.println("perdiste");
            System.out.println("ahora tienes" + (CantFinal -= Cantpost));
        }

        games++;
        System.out.println("llevas jugadas " + games + "partidas");
            System.out.println("¿deseas seguir jugando? - true - si - false - no");
            desici = leer.nextBoolean();
        }

        leer.close();
    }
}
