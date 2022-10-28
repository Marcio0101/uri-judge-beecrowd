package Java;

import java.util.Scanner;

public class SeisNumerosImpares1070 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int contador = 0;

        entrada = teclado.nextInt();

        if (1 <= entrada && entrada <= 1000) {

            while (contador < 6) {
                if (entrada % 2 != 0) {
                    System.out.println(entrada);
                    contador++;
                }
                entrada++;
            }
        }
        teclado.close();

    }
}
