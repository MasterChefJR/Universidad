package u3;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int n, i = 0;

        System.out.println("Escriba el numero entero positivo:");
        n = read.nextInt();
        System.out.println("");

        while (n != 1) {

            i++;
            System.out.println(i + " : " + n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }

        }
        System.out.println(i+1 + " : 1");
    }

}
