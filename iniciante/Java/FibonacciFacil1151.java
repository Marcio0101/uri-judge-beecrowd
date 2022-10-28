package iniciante.java;

import java.util.Scanner;

public class FibonacciFacil1151 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int anterior = 0;
        int atual = 0;
        String impressao = "";
        for (int i = 0; i < n; i++) {
            int temp = atual;
            impressao += atual + " ";

            atual = anterior + atual;
            anterior = temp;
            if (anterior == 0) {
                atual = 1;
            }

        }
        System.out.println(impressao.trim());

        teclado.close();
    }
}
