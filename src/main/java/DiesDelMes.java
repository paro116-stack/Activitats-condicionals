// Activitat 23 — Dies del mes (switch amb casos agrupats)

import java.util.Scanner;

public class DiesDelMes {
    public static void main(String[] args) {
        // TODO amb switch (pots agrupar casos, per exemple: case 1: case 3: ...):
        //   Mesos de 31 dies, de 30 dies, i febrer (28 dies)
        //   Controla els números fora de rang (default)

          Scanner lector = new Scanner(System.in);
        System.out.println("Entra numero mes [1-12]");

        int mes = lector.nextInt();
        switch(mes) {
            case 1:
                System.out.println("31 dies");
                break;
             case 2:
                System.out.println("28 dies");
                break;
             case 3:
                System.out.println("31 dies");
                break;
             case 4:
                System.out.println("30 dies");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30 dies");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30 dies");
                break;
            case 10:
                System.out.println("31 dies");
                break;
            case 11:
                System.out.println("30 dies");
                break;
            case 12:
                System.out.println("31 dies");
                break;
        }
    }
}
