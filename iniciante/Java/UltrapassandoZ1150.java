package iniciante.java;

import java.util.Scanner;

public class UltrapassandoZ1150 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int z = 0;
        int cont = 0;
        int soma = 0;

        do {
            z = teclado.nextInt();
        } while (z <= x);

        for (cont = 0; soma <= z; cont++) {
            soma += x + cont;
        }

        System.out.println(cont);
        teclado.close();
    }
}
