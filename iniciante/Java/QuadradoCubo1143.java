package iniciante.java;

import java.util.Scanner;

public class QuadradoCubo1143 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();
        for (int i = 1; i <= entrada; i++) {

            System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
        }

        teclado.close();
    }
}
