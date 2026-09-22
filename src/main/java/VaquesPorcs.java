// Activitat 03 — Vaques i porcs
import java.util.Scanner;
public class VaquesPorcs {
    public static void main(String[] args) {
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quants vaques hi ha a la granja?");
        int vaques = teclado.nextInt();

        System.out.println("Quants porcs hi ha a la granja?");
        int porcs = teclado.nextInt();

        int total = vaques + porcs;

        int percentatgeVaques = (vaques * 100) / total;
        int percentatgePorcs = (porcs * 100) / total;

        System.out.println("El percentatge és: " + percentatgeVaques + "% de vaques i " + percentatgePorcs + "% de porcs.");

        if (percentatgeVaques > percentatgePorcs) {
            System.out.println("Hi ha més vaques que porcs!");
        } else {
            System.out.println("Hi ha més porcs que vaques!");
        }
    }
}
        
