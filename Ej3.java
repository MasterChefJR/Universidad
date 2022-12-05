package u3;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double n, i = 1, suma = 1;

        System.out.println("Escriba el  valor de N:");
        n = read.nextInt();
        System.out.println("");
        
        if (n > 0) {
            System.out.println("1");
            while (i != n) {
                i++;
                if (i % 2 == 0) {
                    System.out.println("- 1/" + i + "");
                    suma -= (1 / i);

                } else {
                    System.out.println("+ 1/" + i + "");
                    suma += (1 / i);
                }
            }
            System.out.println(suma);
        } else {
            System.out.println("Escriba un numero valido");
        }
    }
}
