// Activitat 24 — Signes del zodíac (switch)

import java.util.Scanner;

public class SignesZodiac {
    public static void main(String[] args) {
        // TODO:
        //   a) Mostra el llistat dels 12 signes amb el seu número
        //   b) Demana un número per teclat
        //   c) Amb un switch, mostra la categoria (Foc, Terra, Aire o Aigua)
        //   Si el número no correspon a cap signe: "ERROR: <número> no associat a cap signe."
        
       
        System.out.println("1. Àries\t2. Capricorn\t3. Balança\t4. Cranc");
        System.out.println("5. Lleó\t\t6. Taure\t7. Aquari\t8. Escorpió");
        System.out.println("9. Sagitari\t10. Verge\t11. Bessons\t12. Peixos");

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceix el número del teu signe:\n");
        
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

           
            switch (numero) {
                case 1:
                case 5:
                case 9:
                    System.out.println("Categoria: Foc");
                    break;
                case 2:
                case 6:
                case 10:
                    System.out.println("Categoria: Terra");
                    break;
                case 3:
                case 7:
                case 11:
                    System.out.println("Categoria: Aire");
                    break;
                case 4:
                case 8:
                case 12:
                    System.out.println("Categoria: Aigua");
                    break;
                default:
                   
                    System.out.println("ERROR: " + numero + " no associat a cap signe.");
                    break;
            }
        } else {
            System.out.println("ERROR: Entrada no vàlida.");
        }

    }
}



