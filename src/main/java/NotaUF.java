// Activitat 04 — Nota d'una UF (mitjana ponderada)
import java.util.Scanner;
public class NotaUF {
    public static void main(String[] args) {
        // TODO: llegeix la nota d'activitats i la nota de proves
        //   La nota final = activitats * 0.10 + proves * 0.90
        //   Mostra la nota final i digues si s'ha aprovat (>= 5) o no
         Scanner teclado = new Scanner(System.in);

        System.out.println("Nota activitats UF:");
        Double notaactivitats = teclado.nextDouble();

        System.out.println("Nota proves UF:");
        Double notaproves = teclado.nextDouble();

        notaactivitats = notaactivitats * 0.10;
        notaproves = notaproves * 0.9;

        Double mitjana = (notaactivitats + notaproves);
        System.out.println("La nota final de la UF:" + mitjana);

        if (mitjana >= 5) {

        System.out.println("Has aprovat la UF!");

        }
        else{
            System.out.println("Has suspes la UF!");
        }
    }                                                                       

}
