package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidacaoNota1117 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        Double media = 0.0;

        while (notas.size() < 2) {
            Double temp = teclado.nextDouble();
            if (temp >= 0 && temp <= 10) {
                notas.add(temp);
            } else {
                System.out.println("nota invalida");
            }
        }
        media = (notas.get(0) + notas.get(1)) / 2.0;
        System.out.println("media = " + String.format("%.2f", media));

        teclado.close();
    }
}
