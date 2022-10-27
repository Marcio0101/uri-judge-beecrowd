package Java;
import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double a, b, c, x1, x2, delta;
        String valor = teclado.nextLine();
        String[] valores = valor.split(" ");
        a = Double.parseDouble(valores[0].replace(",", "."));
        b = Double.parseDouble(valores[1].replace(",", "."));
        c = Double.parseDouble(valores[2].replace(",", "."));

        delta = Math.pow(b, 2) - ((4 * a) * c);

        if (delta >= 0.0 && a != 0.0) {
            x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
            x2 = (-(b) - Math.sqrt(delta)) / (2 * a);

            System.out.println("R1 = " + String.format("%.5f", x1).replace(",", "."));
            System.out.println("R2 = " + String.format("%.5f", x2).replace(",", "."));
        } else {
            System.out.println("Impossivel calcular");
        }
        teclado.close();

    }
}
