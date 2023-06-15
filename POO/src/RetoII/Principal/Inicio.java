package RetoII.Principal;

import RetoII.Salud.*;

public class Inicio {
    public static void main(String[] args) {
        // instanciamos la clase Persona
        Persona piple = new Persona();
        piple.pedirDatos();
        // utilizamos el metodo de la clase Persona
        Double res = piple.iMC(60.0, 1.70);
        if (res < 20) {
            System.out.println("tu indice de masa corporal es de: " + res + " el peso está por debajo de lo ideal");
        } else if (res >= 20 || res <= 25) {
            System.out.println("tu indice de masa corporal es de: " + res + " el peso es ideal");
        } else if (res > 25) {
            System.out.println("tu indice de masa corporal es de: " + res + " usted se encuentra en sobrepeso");
        }

        piple.age();

        // probar despues
        // mostrar todos los atributos de la clase
        // System.out.println(niño.toString());
    }
}
