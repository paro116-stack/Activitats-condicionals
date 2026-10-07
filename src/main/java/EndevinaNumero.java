// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era

           Scanner teclat = new Scanner(System.in);
        Random random = new Random();
 
        int numeroGenerat = random.nextInt(10) + 1;
 
        System.out.println("Endevina el número que he pensat (està entre 1 i 10!):");
        int numeroUsuari = teclat.nextInt();
 
        if (numeroUsuari == numeroGenerat) {
            System.out.println("Enhorabona, has endevinat el número!");
        } else {
            System.out.println("Ho sento, havia generat el número " + numeroGenerat + "!");
        }
 
    }
}
