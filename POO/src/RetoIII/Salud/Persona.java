package RetoIII.Salud;

import java.util.*;

public class Persona {
    // Atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private Double peso;
    private Double estatura;
    private int edad;
    private String sexo;

    // metodo constructor
    public Persona() {}

    // Metodos normales
    public void pedirDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite su tipo de documento");
        tipoDoc = leer.nextLine();
        System.out.println("digite su numero de documento");
        documento = leer.nextInt();
        leer.nextLine();
        System.out.println("digite su nombre");
        nombre = leer.nextLine();
        System.out.println("digite su apellido");
        apellido = leer.nextLine();
        System.out.println("digite su peso en Kg");
        peso = leer.nextDouble();
        System.out.println("digite su estatura en cm");
        estatura = leer.nextDouble();
        System.out.println("digite su edad cumplida en años");
        edad = leer.nextInt();
        System.out.println("digite su sexo siendo M para masculino y F para femenino");
        leer.nextLine();
        sexo = leer.nextLine();
        leer.close();
    }

    // metodos getters y setters
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // metodos
    public void mostrarPersona() {
        System.out.println("su tipo de documento es: " + tipoDoc);
        System.out.println("su numero de documento es: " + documento);
        System.out.println("su nombre es: " + nombre);
        System.out.println("su apellido es: " + apellido);
        System.out.println("su peso en Kg es: " + peso);
        System.out.println("su altura en cm es: " + estatura);
        System.out.println("su edad cumplida en años es: " + edad);
        System.out.println("su tipo de sexo es: " + sexo);
    }

    public Double iMC(Double peso, Double altura) {
        return peso = Math.floor(peso / (altura * altura));

    }

    public void age() {
        if (edad >= 18) {
            System.out.println("usted es mayor de edad");
        } else {
            System.out.println("usted es menor de edad");
        }
    }
}
