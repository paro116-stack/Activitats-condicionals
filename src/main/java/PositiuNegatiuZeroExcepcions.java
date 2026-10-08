// Activitat 26 — Positiu, negatiu o zero, amb control d'excepcions
 import java.util.InputMismatchException;
import java.util.Scanner;
public class PositiuNegatiuZeroExcepcions {
    public static void main(String[] args) {
        // TODO: com l'activitat 08, però controla amb try/catch que l'usuari
        //   introdueixi un número enter vàlid

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduceix un número:");
            int numero = scanner.nextInt();

          
            if (numero > 0) {
                System.out.println("El número és positiu");
            } else if (numero < 0) {
                System.out.println("El número és negatiu");
            } else {
                System.out.println("El número és zero");
            }
        } catch (InputMismatchException e) {
            // Se ejecuta si el usuario introduce un tipo de dato que no es un entero
            System.out.println("Error: has d'introduir un número enter");
        } 
    }
}
