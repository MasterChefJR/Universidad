package u3;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int nv , v, x1 = 0, x2 = 0, x3 = 0;
        
        System.out.println("Escriba el numero de ventas:");
        nv = read.nextInt();
        System.out.println("");
        
        for (int i = 0; i < nv; i++) {
            System.out.println("Escriba el valor de la venta:");
            v = read.nextInt();

            if (v < 200) {
                x1++;
            } else if ((v >= 200) && (v < 400)) {
                x2++;
            } else {
                x3++;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println(x1+" Ventas fueron menores de $200");
        System.out.println(x2+" Ventas fueron de $200 o mayores pero menores de 400");
        System.out.println(x3+" Ventas fueron de $400 o mayores");
    }
}
