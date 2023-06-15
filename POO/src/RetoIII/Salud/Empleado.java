package RetoIII.Salud;

public class Empleado extends Persona {
    private String cargo;
    private Double valorHora;
    private int horasTrabajadas;
    private String departamento;

    public Empleado() {
    }

    public Empleado(String cargo, Double valorHora, int horasTrabajadas, String departamento) {
        // invocamos el CONSTRUCTOR DE LA CLASE PADRE
        super();
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    // metodos
    public String calcularHonorarios(String tipoDoc, int documento, String nombre, String apellido, String cargo,
            Double valorHora, int horasTrabajadas) {
        Double res = 0.0, reteica = 0.0;
        String frase;
        reteica = ((valorHora * horasTrabajadas) * 0.966);
        res = ((valorHora * horasTrabajadas) - reteica);
        res = res / 100;
        frase = "el trabajador " + nombre + " " + apellido + " identificado con " + tipoDoc + " de numero " + documento
                + " trabaja como " + cargo + ", este lleva contabilizadas " + horasTrabajadas
                + " horas trabajadas las cuales se pagan cada una a " + valorHora
                + " dolares y por ende el total a pagar es de " + res + " dolares";
        return frase;
    }
}
