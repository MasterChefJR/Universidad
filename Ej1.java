package u3;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        //Declaraciones
        int n, prom = 0, nprom = 0, sumaprom = 0, sumaimp = 0;
        Scanner read = new Scanner(System.in);

        //Proceso
        for (int i = 0; i < 6; i++) {
            System.out.println("Escriba el valor del numero entero:");
            n = read.nextInt();

            if (n % 2 == 0) {
                nprom = nprom + 1;
                sumaprom = sumaprom + n;
                prom = sumaprom / nprom;
            } else {
                sumaimp = sumaimp + n;
            }
        }

        //Salida
        System.out.println("El promedio de los numeros pares es " + prom);
        System.out.println("La suma de los numeros impares es " + sumaimp);
    }
}
