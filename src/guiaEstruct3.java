// Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

import java.util.Scanner;

public class guiaEstruct3 {

    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una nota del 0 al 10: ");
            nota = leer.nextInt();
        } while ((nota < 0) || (nota > 10));
        System.out.println("Perfecto, ingreso un: " + nota);
    }
}
