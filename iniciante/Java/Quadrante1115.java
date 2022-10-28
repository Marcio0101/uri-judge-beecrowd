package Java;

import java.util.Scanner;

public class Quadrante1115 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer x = 0;
        Integer y = 0;

        String entrada = teclado.nextLine();

        x = Integer.parseInt(entrada.split(" ")[0]);
        y = Integer.parseInt(entrada.split(" ")[1]);

        do {

            if (x > 0) {
                System.out.println(y > 0 ? "primeiro" : "quarto");
            } else if (x < 0) {
                System.out.println(y > 0 ? "segundo" : "terceiro");
            }

            entrada = teclado.nextLine();

            x = Integer.parseInt(entrada.split(" ")[0]);
            y = Integer.parseInt(entrada.split(" ")[1]);

        } while (x != 0 && y != 0);

        teclado.close();
    }
}
