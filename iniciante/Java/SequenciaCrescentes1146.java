package iniciante.java;

import java.util.Scanner;

public class SequenciaCrescentes1146 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = 0;

        do {
            x = teclado.nextInt();
            if (x > 0) {
                String impressao = "";
                for (int i = 1; i <= x; i++) {
                    impressao += i + " ";
                }
                System.out.println(impressao.trim());
            }
        } while (x != 0);
        teclado.close();
    }
}
