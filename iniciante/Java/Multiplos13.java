package Java;

import java.util.Scanner;

public class Multiplos13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int soma = 0;

        x = teclado.nextInt();
        y = teclado.nextInt();

        for (int i = x; (x > y && i >= y) || (x < y && i <= y); i += x > y ? -1 : 1) {
            
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);

        teclado.close();
    }
}
