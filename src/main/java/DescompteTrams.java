// Activitat 16 — Descompte per trams

import java.util.Scanner;

public class DescompteTrams {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat N i resta-li el descompte segons el tram
        //   N < 500          -> 5%
        //   500 <= N < 1000  -> 8%
        //   1000 <= N <= 5000 -> 15%
        //   N > 5000         -> 25%
        //   Mostra el resultat
             Scanner teclat = new Scanner(System.in);
 
        System.out.println("Introdueix una quantitat:");
        double n = teclat.nextDouble();
 
        double descompte;
 
        if (n < 500) {
            descompte = 0.05;
        } else if (n < 1000) {
            descompte = 0.08;
        } else if (n <= 5000) {
            descompte = 0.15;
        } else {
            descompte = 0.25;
        }
 
        double resultat = n - (n * descompte);
 
        System.out.println("El resultat és: " + resultat);
    }
}
