package u3;

public class Ej2 {

    public static void main(String[] args) {

        int i = 1, num = 2, suma = 0;

        System.out.println(i + ":" + num);

        while (num != 1800) {

            suma += num;

            if (i % 2 == 0) {
                num = num + 2;
            } else {
                num = num + 3;
            }
            i++;
            System.out.println(i + ":" + num);
        }
            System.out.println("La suma es " + suma);
    }
}
