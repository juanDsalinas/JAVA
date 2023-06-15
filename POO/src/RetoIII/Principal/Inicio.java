package RetoIII.Principal;

import RetoIII.Salud.*;

public class Inicio {
    public static void main(String[] args) {
        Empleado uno = new Empleado("administrador", 20.00, 40, "cundinamarca");
        System.out.println(uno.calcularHonorarios("CC", 1029384726, "juan", "salinas", 
        "desarrollador", 50.00, 40));

    }

}
