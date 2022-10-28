package iniciante.java;

import java.util.Scanner;

public class SequenciaLogica1145 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String entrada = teclado.nextLine();
        x = Integer.parseInt(entrada.split(" ")[0]);
        y = Integer.parseInt(entrada.split(" ")[1]);

        for (int i = 1; i < y; i += x) {
            String impressao = "";
            for (int j = 0; j < x; j++) {
                impressao += i + j + " ";
            }
            System.out.println(impressao.trim());
        }

        teclado.close();
    }
}
