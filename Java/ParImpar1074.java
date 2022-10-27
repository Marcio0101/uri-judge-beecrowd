package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParImpar1074 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        List<Integer> lista = new ArrayList<>();

        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            lista.add(teclado.nextInt());
        }

        lista.forEach((entrada) -> {
            if (entrada != 0) {
                System.out.println(
                        ((entrada % 2 == 0) ? "EVEN" : "ODD") + " " + ((entrada > 0) ? "POSITIVE" : "NEGATIVE"));
            } else {
                System.out.println("NULL");
            }
        });
        teclado.close();
    }
}
