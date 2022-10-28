package Java;

import java.util.Scanner;

public class SequenciaLogica1144 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();

        for (int i = 1; i <= entrada; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " " + (int) (Math.pow(i, 2) + j) + " " + (int) (Math.pow(i, 3) + j));
            }
        }

        teclado.close();
    }
}
