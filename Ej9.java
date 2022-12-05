package u3;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double n, cua, suma = 0;

        System.out.println("Escriba el numero entero:");
        n = read.nextInt();
        System.out.println("");

        for (int i = 1; i <= n; i++) {

            cua = (double) Math.pow(i, i);
            System.out.println(i + "**" + i + " = " + cua);

            suma += cua;
        }
        System.out.println("");
        
        System.out.println("La suma de los cuadrados es igual a " + suma);
    }
}
