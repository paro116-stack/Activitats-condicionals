// Activitat 14 — Entre 1 i 10 i parell (if-else aniuada)
import java.util.Scanner;
public class EntreU10Parell {
    public static void main(String[] args) {
        // TODO amb if-else aniuada: llegeix un número enter
        //   Digues si està entre 1 i 10 I, a més, si és parell

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un numero parell: ");
        int enter = teclat.nextInt();

        if (enter > 0) {
            if (enter < 10) {
                System.out.print("El numero està entre 1 i 10");
                if (enter % 2 == 0) {
            System.out.println(" i és parell");
            }
        
            
        }
    }
  }
}