package Java;

import java.util.Scanner;

public class QuadradoPares1073 {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + String.format("%.0f", Math.pow(i, 2)));
            }
        }
        teclado.close();

    }
}
