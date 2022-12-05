package u3;

public class Ejj10 {

    public static void main(String[] args) {

        int n1 = 0, n2 = 1, suma = 1;

        System.out.println(n1);

        for (int i = 1; i < 180; i++) {

            System.out.println( suma);

            suma = n1 + n2;
            n1 = n2;
            n2 = suma;

        }
    }

}
