// Activitat 06 — Rectangle o quadrat
import java.util.Scanner;
public class RectangleQuadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no

        Scanner teclat = new Scanner (System.in);
       System.out.println("Entra el valor del costat gran del rectangle:");
       double costatGran = teclat.nextInt();

       System.out.println("Entra el valor del costat petit del rectangle:");
       double costatPetit = teclat.nextInt();

       double area = costatGran*costatPetit;
       double perimetre = costatGran*2 + costatPetit*2;

       System.out.println("Perimetre del rectangle = " + perimetre);
       System.out.println("Àrea del rectangle = " + area);

       if (costatGran == costatPetit) {
        System.out.println("Es un quadrat!");
           
       }
       else{
        System.out.println("No es un quadrat");
       }

       
    }
}
