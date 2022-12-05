package u3;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int nn, n, nmen = 1000000, nmay = -1000000;

        System.out.println("Escriba la cantidad de numeros:");
        nn = read.nextInt();

        for (int i = 0; i < nn; i++) {

            System.out.println("Escriba el numero entero:");
            n = read.nextInt();

            if (n < nmen) {
                nmen = n;
            }
            if (n > nmay) {
                nmay = n;
            }
        }
        
        System.out.println("El numero mayor es " + nmay + " y el menor es " + nmen);
        
    }

}
