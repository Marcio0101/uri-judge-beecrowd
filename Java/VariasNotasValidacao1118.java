package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VariasNotasValidacao1118 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        do {
            List<Double> notas = new ArrayList<>();
            Double media = 0.0;
            opcao = 0;

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
            while (opcao < 1 || opcao > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = teclado.nextInt();
            }

        } while (opcao == 1);
        teclado.close();

    }
}
