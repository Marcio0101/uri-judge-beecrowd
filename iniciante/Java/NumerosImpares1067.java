package Java;
import java.util.Scanner;

public class NumerosImpares1067 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;

        entrada = teclado.nextInt();

        if (1 <= entrada && entrada <= 1000) {

            for (int i = 0; i <= entrada; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        teclado.close();

    }
}
