// Activitat 13 — Índex de massa corporal (IMC)
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        // TODO: llegeix l'altura en cm i el pes en kg
        //   IMC = pes / (altura_en_metres al quadrat)
        //   Classificació OMS: <18.5 Pes insuficient, <25 Pes normal, <30 Sobrepès, >=30 Obesitat
      Scanner teclat = new Scanner(System.in);
      System.out.println("Introdueix l'altura en cm:");
      double altura = teclat.nextInt();

      System.out.println("Introdueix el pes en kg:");
      double pes = teclat.nextInt();

      double IMC = pes/((altura/100) * 2);
      System.out.println("L'IMC es:" + IMC);

     

     if (IMC < 18.5) {
            System.out.println("Classificació (OMS): Pes insuficient");
        } else if (IMC <= 24.9) {
            System.out.println("Classificació (OMS): Pes normal");
        } else if (IMC <= 29.9) {
            System.out.println("Classificació (OMS): Sobrepès");
        } else {
            System.out.println("Classificació (OMS): Obesitat");
        }

    }
}
