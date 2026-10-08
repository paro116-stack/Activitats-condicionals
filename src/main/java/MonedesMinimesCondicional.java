// Activitat 27 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims (comprova que sigui >= 0)
        //   Mostra la quantitat mínima de monedes de 1, 2, 5, 10, 20, 50, 100 i 200 cèntims
        //   Només mostra les línies amb quantitat > 0

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introduceix una quantitat (cèntims euro): ");
        if (teclat.hasNextInt()) {
            int centims = teclat.nextInt();

            if (centims >= 0) {
               
                int monedes = centims / 200;
                if (monedes > 0) {
                    System.out.println(monedes + " monedes de 2 euros");
                    centims %= 200;
                }

               
                monedes = centims / 100;
                if (monedes > 0) {
                    System.out.println(monedes + " monedes d'1 euro");
                    centims %= 100;
                }

              
                monedes = centims / 50;
                if (monedes > 0) {
                    System.out.println(monedes + " monedes de 50 cèntims");
                    centims %= 50;
                }

                monedes = centims / 20;
                if (monedes > 0) {
                    System.out.println(monedes + " monedes de 20 cèntims");
                    centims %= 20;
                }

                
                monedes = centims / 10;
                if (monedes > 0) {
                    System.out.println(monedes + " monedes de 10 cèntims");
                    centims %= 10;
                }

                
                monedes = centims / 5;
                if (monedes > 0) {
                    System.out.println(monedes + " monedes de 5 cèntims");
                    centims %= 5;
                }

               
                monedes = centims / 2;
                if (monedes > 0) {
                    String textMoneda = (monedes == 1) ? "moneda" : "monedes";
                    System.out.println(monedes + " " + textMoneda + " de 2 cèntims");
                    centims %= 2;
                }

            

                monedes = centims / 1;
                if (monedes > 0) {
                    String textMoneda = (monedes == 1) ? "moneda" : "monedes";
                    System.out.println(monedes + " " + textMoneda + " de 1 cèntims");
                }
            } else {
                System.out.println("La quantitat ha de ser >= 0");
            }
        }
    }
}
