package iniciante.java;

import java.util.Scanner;

public class SomandoInteirosConsecutivos1149 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] entrada = teclado.nextLine().split(" ");

        int a = Integer.parseInt(entrada[0]);
        int n = Integer.parseInt(entrada[entrada.length - 1]);
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += a + i;
        }
        System.out.println(soma);
        teclado.close();
    }
}
