package iniciante.java;

import java.util.Scanner;

public class PUM1142 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int entrada = teclado.nextInt();

        for (int i = 1; i <= entrada; i++) {
            String impressao = "";
            for (int j = 3; j >= 0; j--) {

                impressao += " " + (j == 0 ? "PUM" : 4 * i - j);

            }
            System.out.println(impressao.trim());
        }

        teclado.close();
    }
}
