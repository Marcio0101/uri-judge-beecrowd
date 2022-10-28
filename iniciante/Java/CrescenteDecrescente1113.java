package Java;

import java.util.Scanner;

public class CrescenteDecrescente1113 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String entrada = "";

        entrada = teclado.nextLine();

        x = Integer.parseInt(entrada.split(" ")[0]);
        y = Integer.parseInt(entrada.split(" ")[1]);

        do {
            System.out.println((x>y? "Decrescente" : "Crescente"));


            entrada = teclado.nextLine();

            x = Integer.parseInt(entrada.split(" ")[0]);
            y = Integer.parseInt(entrada.split(" ")[1]);
        } while (!(x == y));

        teclado.close();
    }
}
