package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPositivosMedia1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Double n = teclado.nextDouble();
            if (n > 0.0) {
                numeros.add(n);
            }
        }

        System.out.println(numeros.size() + " valores positivos");
        System.out.println(String.format("%.1f", numeros.stream().reduce(0.0, Double::sum) / numeros.size()));
        teclado.close();

    }
}
