// Activitat 21 — Pedra, paper o tisora
// Ajuda: java.util.Random -> random.nextInt(3)  (0 pedra, 1 paper, 2 tisora)

import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisora {
    public static void main(String[] args) {
        // TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)

        Scanner teclat = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Entra pedra, paper o tisora:");
        String jugadaUsuari = teclat.nextLine().trim().toLowerCase();

        
        int opcioOrdinador = random.nextInt(3);
        String jugadaOrdinador = "";

        switch (opcioOrdinador) {
            case 0:
                jugadaOrdinador = "pedra";
                break;
            case 1:
                jugadaOrdinador = "paper";
                break;
            case 2:
                jugadaOrdinador = "tisora";
                break;
        }

        System.out.println("Ordinador ha tret: " + jugadaOrdinador);

       
        if (jugadaUsuari.equals(jugadaOrdinador)) {
            System.out.println("Heu empatat!!");
        } else if ((jugadaUsuari.equals("pedra") && jugadaOrdinador.equals("tisora")) ||
                   (jugadaUsuari.equals("paper") && jugadaOrdinador.equals("pedra")) ||
                   (jugadaUsuari.equals("tisora") && jugadaOrdinador.equals("paper"))) {
            System.out.println("Has guanyat!");
        } else if (jugadaUsuari.equals("pedra") || jugadaUsuari.equals("paper") || jugadaUsuari.equals("tisora")) {
            System.out.println("Has perdut!");
        } else {
            System.out.println("Opció no vàlida");
        }


    }
}
