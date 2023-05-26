import java.util.*;

public class RETO_III {
    public static void main(String[] args) {
        int n, vidas = 8, a = 1, m = 1, o = 1, r = 1;
        String res;
        Scanner leer = new Scanner(System.in);
        System.out.println("de cuantas letras deseas que tenga tu palabra");
        n = leer.nextInt();
        String[] word = new String[n];
        // crear palabra
        for (int i = 0; i < n; i++) {
            System.out.println("digite letra para el campo : " + i);
            word[i] = leer.next();
        }
        leer.nextLine();
        for (int i = 0; i < vidas; i++) {
            System.out.println("trata de averiguar la palabra letra por letra");
            res = leer.nextLine();
            res.toLowerCase();
            if ((a + m + o + r) == 0) {
                System.out.println("encontraste todas las letras");
                break;
            } else {
                switch (res) {
                    case "a":
                        if (a != 0) {
                            a -= 1;
                            System.out.println("felicidades, encontraste una letra");
                            continue;
                        } else {
                            System.out.println("ya ingresaste esta letra");
                        }
                        break;
                    case "m":
                        if (m != 0) {
                            m -= 1;
                            System.out.println("felicidades, encontraste una letra");
                            continue;
                        } else {
                            System.out.println("ya ingresaste esta letra");
                        }
                        break;
                    case "o":
                        if (o != 0) {
                            o -= 1;
                            System.out.println("felicidades, encontraste una letra");
                            continue;
                        } else {
                            System.out.println("ya ingresaste esta letra");
                        }
                        break;
                    case "r":
                        if (r != 0) {
                            r -= 1;
                            System.out.println("felicidades, encontraste una letra");
                            continue;
                        } else {
                            System.out.println("ya ingresaste esta letra");
                        }
                        break;
                    default:

                        System.out.println("la letra digitada es invalida");
                        break;
                }
            }

        }
        // limpiamos el buffer
        leer.close();
    }
}