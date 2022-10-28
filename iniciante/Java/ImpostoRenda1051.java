package iniciante.java;
import java.util.Scanner;

public class ImpostoRenda1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double entrada;

        entrada = teclado.nextDouble();
        entrada = entrada - 2000.0;

        if (entrada <= 0) {
            System.out.println("Isento");
        } else {
            Double impressao = 0.0;
            impressao += (entrada > 1000 ? 1000 : entrada) * 0.08;
            entrada -= 1000.0;
            if (entrada > 0) {
                impressao += (entrada > 1500 ? 1500 : entrada) * 0.18;
                entrada -= 1500;
                impressao += entrada > 0 ? entrada * 0.28 : 0;
            }

            System.out.println("R$ " + String.format("%.2f", impressao));
        }
        teclado.close();

    }
}
