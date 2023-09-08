package iniciante.java;

import java.util.Scanner;

public class Idades1154 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade = teclado.nextInt();
        int soma = 0;
        int contador = 0;

        while (idade >= 0) {
            soma += idade;
            contador++;
            idade = teclado.nextInt();
        }

        System.out.printf("%.2f\n", (double) soma / contador);
    }
}
