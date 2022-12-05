package u3;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        float sue = 0, tot = 0;
        while (sue != -1) {
            System.out.println("Escriba su sueldo:");
            sue = read.nextInt();

            if ((sue > 0) && (sue < 1000)) {
                sue = sue * 1.15f;
            } else if ((sue > 0) && (sue >= 1000)) {
                sue = sue * 1.12f;
            }

            tot += sue;

        }
        System.out.println("El total sera $" + (tot+1));
    }
}
