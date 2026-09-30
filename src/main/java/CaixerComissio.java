// Activitat 10 — Caixer, comissió i saldo
import java.util.Scanner;
public class CaixerComissio {
    public static void main(String[] args) {
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant

         Scanner teclat = new Scanner (System.in);
       System.out.println("Introdueix el saldo actual:");
       double Saldoactual = teclat.nextDouble();

       System.out.println("Introdueix la quantitat a treure:");
       double retirar = teclat.nextDouble();

       System.out.println("Fas servir caixer propi? (S/N):");
       char caixerpropi = teclat.next().toUpperCase().charAt(0);
       double comissio = 0;

       if (caixerpropi == 'N') {
        comissio = retirar * 0.05;
       }
       double totalretirar = retirar + comissio;

       if (totalretirar <= Saldoactual) {
        double saldoRestant = Saldoactual - totalretirar;

        System.out.println("Quantitat a retirar: " + retirar);
        System.out.println("Comissio: " + comissio);
        System.out.println("Saldo restant: " + saldoRestant);
           }
        
        else {
            System.out.println("No es pot fer la retirada. Saldo insuficient.");
            
    }
 }
}