// Activitat 01 — Febre
import java.util.Scanner;
public class Febre {
    public static void main(String[] args) {
        // TODO: llegeix la temperatura (real, per teclat) i digues si hi ha febre
        //   Si temperatura > 37 -> "Tens febre, has d'anar cap a casa a descansar!!"
        //   Si no -> un altre missatge (per exemple, que pot quedar-se)

       Scanner teclat = new Scanner (System.in);
       System.out.println("Entra un numero real:");
       double febre = teclat.nextDouble();
       
    
       if (febre>=37) {
        System.out.println("Tens febre, has d'anar cap a casa a descansar!");
           
       }
       else{ 
        System.out.println("No tens febre");

       }


    
       
    }
}
