package iniciante.java;

import java.util.Scanner;

public class NumerosPositivos1060 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtde = 0;
        for (int i = 0; i < 6; i++) {
            if (teclado.nextDouble() > 0.0) {
                qtde++;
            }
        }

        System.out.println(qtde + " valores positivos");
        teclado.close();

    }
}
