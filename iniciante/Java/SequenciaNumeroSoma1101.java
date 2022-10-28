package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SequenciaNumeroSoma1101 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer m = 0;
        Integer n = 0;
        String entrada = teclado.nextLine();

        m = Integer.parseInt(entrada.split(" ")[0]);
        n = Integer.parseInt(entrada.split(" ")[1]);

        do {
            List<Integer> tempList = new ArrayList<>();
            for (int i = m; m > n ? i >= n : i <= n; i += m > n ? -1 : 1) {
                tempList.add(i);
            }
            if (m > n)
                Collections.reverse(tempList);

            System.out.println(tempList.stream().map((a) -> {
                return a + " ";
            }).reduce("", String::concat).trim() + " Sum="
                    + tempList.stream().reduce(0, Integer::sum));

            entrada = teclado.nextLine();
            m = Integer.parseInt(entrada.split(" ")[0]);
            n = Integer.parseInt(entrada.split(" ")[1]);

        } while (m > 0 && n > 0);

        teclado.close();
    }
}
