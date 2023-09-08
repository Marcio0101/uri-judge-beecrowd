package iniciante.java;

import java.util.Scanner;

public class FatorialSimples1153 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= entrada; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
