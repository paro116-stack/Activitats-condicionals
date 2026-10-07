// Activitat 20 — Login amb usuari i contrasenya
import java.util.Scanner;
public class LoginUsuariPassword {
    public static void main(String[] args) {
        // Informació secreta
        final String username = "cponts";
        final String password = "qw34T1234";

        // TODO: demana username i password per teclat
        //   Digues si són correctes o no

        Scanner teclat = new Scanner(System.in);
 
        System.out.println("Introdueix el nom d'usuari:");
        String usuari = teclat.next();
 
        System.out.println("Introdueix la contrasenya:");
        String contrasenya = teclat.next();
 
        if (usuari.equals(username) && contrasenya.equals(password)) {
            System.out.println("Usuari i contrasenya correctes!");
        } else {
            System.out.println("Usuari o contrasenya incorrectes!");
        }
    }
}
