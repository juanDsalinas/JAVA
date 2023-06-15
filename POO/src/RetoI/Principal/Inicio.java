package RetoI.Principal;

import RetoI.Salud.*;

public class Inicio {
    public static void main(String[] args) {
        // instanciamos la clase Persona
        Persona people = new Persona();
        // utilizamos el metodo de la clase Persona
        people.pedirDatos();
        people.iMC();
        people.age();

        // probar despues
        // mostrar todos los atributos de la clase
        // System.out.println(niño.toString());
    }
}
