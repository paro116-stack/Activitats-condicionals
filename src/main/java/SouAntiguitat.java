// Activitat 15 — Sou i antiguitat
import java.util.Scanner;
public class SouAntiguitat {
    public static void main(String[] args) {
        // TODO: llegeix el sou i els anys d'antiguitat
        //   a) sou < 500 i antiguitat >= 10 -> augment del 20%
        //   b) sou < 500 i antiguitat < 10  -> augment del 5%
        //   c) sou >= 500                   -> sense canvis
       
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix el sou de l'operari: ");
        double sou = teclat.nextDouble();

        System.out.print("Introdueix els anys d'antiguitat: ");
        int antiguitat = teclat.nextInt();

        double nousou = sou;

        if (sou < 500) {
            if (antiguitat >= 10) {
                nousou = sou * 1.20; 
            } else {
                nousou = sou * 1.05; 
            }
        } 

        System.out.println("El sou a pagar és: " + nousou);
    }
}
