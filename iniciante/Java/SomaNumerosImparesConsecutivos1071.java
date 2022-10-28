package iniciante.java;

import java.util.Scanner;

public class SomaNumerosImparesConsecutivos1071 {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        int soma = 0;

        x = teclado.nextInt();
        y = teclado.nextInt();
        z = x;
        while ((x > y && z > y) || (x < y && z < y)) {
            if (z % 2 != 0 && z != x) {
                soma += z;
            }

            z += x > y ? -1 : 1;
        }

        System.out.println(soma);
        teclado.close();

    }
}
