// Activitat 22 — Nom del mes (switch)
import java.util.Scanner;
public class NomDelMes {
    public static void main(String[] args) {
        // TODO amb switch: llegeix un número de mes (1-12) i mostra el seu nom
        //   Controla els números fora de rang (default)

        Scanner lector = new Scanner(System.in);
        System.out.println("Entra numero mes [1-12]");

        int mes = lector.nextInt();
        switch(mes) {
            case 1:
                System.out.println("31 dies");
                break;
             case 2:
                System.out.println("28 dies");
                break;
             case 3:
                System.out.println("31 dies");
                break;
             case 4:
                System.out.println("30 dies");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30 dies");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30 dies");
                break;
            case 10:
                System.out.println("31 dies");
                break;
            case 11:
                System.out.println("30 dies");
                break;
            case 12:
                System.out.println("31 dies");
                break;
        }
    }
}
