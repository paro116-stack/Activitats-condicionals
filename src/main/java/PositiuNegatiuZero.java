// Activitat 08 — Positiu, negatiu o zero
import java.util.Scanner;
public class PositiuNegatiuZero {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és positiu, negatiu o zero
        
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un numero enter:");
        int enter = teclat.nextInt();

        if (enter>0) {
            System.out.println("El numero es positiu!");   
        }
        if (enter<0) {
            System.out.println("El número és negatiu");   
        }  
        if (enter == 0) {
            System.out.println("Es zero");
        }   

    }
}
