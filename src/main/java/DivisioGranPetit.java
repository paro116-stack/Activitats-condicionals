// Activitat 07 — Dividir el més gran entre el més petit
import java.util.Scanner;
public class DivisioGranPetit {
    public static void main(String[] args) {
        // TODO: llegeix 2 números diferents
        //   Si són iguals -> "Els números han de ser diferents"
        //   Troba el més gran i el més petit
        //   Si el més petit és 0 -> "El divisor no pot ser 0"
        //   Si no, mostra el resultat de dividir el gran entre el petit

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el primer numero:");
        Double primernum = teclat.nextDouble();

        System.out.println("Introdueix el segon numero:");
        double segonnum = teclat.nextDouble();

        if (primernum == segonnum) {
            System.out.println("Els numeros han de ser diferents");   
        }
        else{
            Double gran = Double.max(primernum, segonnum);
            Double petit = Double.min(primernum,segonnum);
             if (petit == 0) {
            System.out.println("El divisor no pot ser 0");

        }
        else{
            double resultat = gran / petit;

           System.out.println("Resultat = " + resultat);
        }
        }


    }
}
