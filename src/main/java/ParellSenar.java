// Activitat 02 — Parell o senar
import java.util.Scanner;
public class ParellSenar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és parell o senar
        //   Recorda: numero % 2 == 0 -> parell

        Scanner teclat = new Scanner (System.in);
        System.out.println("Entra un numero enter:");
        int enter = teclat.nextInt();

        if (enter % 2 == 0) {
            System.out.println("El número es parell");
            
        }
        else{
            System.out.println("El número és senar");
        }

    
        
        


    }
}
