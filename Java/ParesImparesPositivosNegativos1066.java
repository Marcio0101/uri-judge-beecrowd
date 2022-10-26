package Java;

import java.util.Scanner;

public class ParesImparesPositivosNegativos1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Pares, Ímpares, Positivos e Negativos respectivamente atribuido a cada
        // posicao do vetor.
        int[] cont = { 0, 0, 0, 0 };

        for (int i = 0; i < 5; i++) {
            int temp = teclado.nextInt();
            if ((temp % 2) == 0) {
                cont[0]++;
            } else {
                cont[1]++;
            }
            if (temp != 0) {
                if (temp > 0) {
                    cont[2]++;
                } else {
                    cont[3]++;
                }
            }
        }

        System.out.println(cont[0] + " valor(es) par(es)");
        System.out.println(cont[1] + " valor(es) impar(es)");
        System.out.println(cont[2] + " valor(es) positivo(s)");
        System.out.println(cont[3] + " valor(es) negativo(s)");

    }
}
