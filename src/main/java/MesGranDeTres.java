// Activitat 12 — El més gran de tres números
import java.util.Scanner;
public class MesGranDeTres {
    public static void main(String[] args) {
        // TODO: llegeix 3 números i mostra quin és el més gran

        Scanner teclat = new Scanner(System.in);

        
        System.out.println("Introduceix el primer número:");
        int num1 = teclat.nextInt();

        System.out.println("Introduceix el segon número:");
        int num2 = teclat.nextInt();

        System.out.println("Introduceix el tercer número:");
        int num3 = teclat.nextInt();

        int mesGran = num1;

        if (num2 > mesGran) {
            mesGran = num2;
        }

        if (num3 > mesGran) {
            mesGran = num3;
        }
        System.out.println("El número més gran és: " + mesGran);
        
    }
}
