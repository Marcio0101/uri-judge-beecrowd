package Java;

import java.util.Scanner;

public class Intervalo1072 {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int quantidadeTestes = 0;
        int in = 0;
        int out = 0;

        quantidadeTestes = teclado.nextInt();

        for (int i = 0; i < quantidadeTestes; i++) {
            int temp = teclado.nextInt();
            if (temp >= 10 && temp <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
