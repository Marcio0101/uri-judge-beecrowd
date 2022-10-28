package Java;

import java.util.Scanner;

public class ParesEntreCincoNumeros1065 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contPar = 0;

        for (int i = 0; i < 5; i++) {
            if ((teclado.nextInt() % 2) == 0) {
                contPar++;
            }
        }

        System.out.println(contPar + " valores pares");
        teclado.close();

    }
}
