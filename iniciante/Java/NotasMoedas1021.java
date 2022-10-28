package iniciante.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotasMoedas1021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Double> valores = new ArrayList<>();
        valores.add(100.0);
        valores.add(50.0);
        valores.add(20.0);
        valores.add(10.0);
        valores.add(5.0);
        valores.add(2.0);
        valores.add(1.0);
        valores.add(0.5);
        valores.add(0.25);
        valores.add(0.10);
        valores.add(0.05);
        valores.add(0.01);

        Double valor = teclado.nextDouble();
        valor+=0.0001;
        for (Double v : valores) {
            String tipo = v > 1 ? "nota" : "moeda";
            if (v == 100.0) {
                System.out.println("NOTAS:");
            }
            if (v == 1.0) {
                System.out.println("MOEDAS:");
            }

            System.out.println((int) (valor / v) + " " + tipo + "(s) de R$ " + String.format("%.2f", v).replace(",", "."));
            valor = valor % v;
        }

        teclado.close();
    }
}
