package Java;

import java.util.Scanner;

public class Resto1075 {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        n = teclado.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
        teclado.close();

    }
}
