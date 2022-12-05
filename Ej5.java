package u3;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int n, nn, np = 0, sp = 0, st = 0;
        float promt = 0, promp = 0;

        System.out.println("Escriba la cantidad de numeros a introducir:");
        nn = read.nextInt();
        System.out.println("");
        
        for (int i = 0; i < nn; i++) {

            System.out.println("Escriba el numero:");
            n = read.nextInt();

            if (n > 0) {
                np++;
                sp += n;
            }
            st += n;
        }
        
        promp = (float) sp/np;
        promt = (float) st/nn;
        
        
        System.out.println("");
        System.out.println(np + " Numeros son positivos");
        System.out.println(promp + " Es el promedio de los numeros positivos");
        System.out.println(promt + " Es el promedio de todos los numeros");
    }
}
