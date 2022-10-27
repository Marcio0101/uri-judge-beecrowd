package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SequenciaNumeroSoma1101 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<List<Integer>> numeros = new ArrayList<>();
        Integer m = 0;
        Integer n = 0;
        String entrada = teclado.nextLine();

        m = Integer.parseInt(entrada.split(" ")[0]);
        n = Integer.parseInt(entrada.split(" ")[1]);

        do {
            List<Integer> tempList = new ArrayList<>();
            for (int i = m; i >= n; i--) {
                tempList.add(i);
            }
            numeros.add(tempList);

            entrada = teclado.nextLine();
            m = Integer.parseInt(entrada.split(" ")[0]);
            n = Integer.parseInt(entrada.split(" ")[1]);
        } while (m > 0 && n > 0);

        numeros.forEach((lista) -> {
            if (lista.size() == 0) {
                return;
            }
            Collections.reverse(lista);
            Integer soma = lista.stream().mapToInt(Integer::intValue).sum();

            String impressao = lista.stream().map(String::valueOf).reduce("", (a, b) -> a + " " + b);

            System.out.println(impressao.trim() + " Sum=" + soma);
        });

        teclado.close();
    }
}
