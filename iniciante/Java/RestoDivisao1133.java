package iniciante.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RestoDivisao1133 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int x = 0;
        int y = 0;

        x = teclado.nextInt();
        y = teclado.nextInt();

        for (int i = x; (x > y && i > y) || (x < y && i < y); i += x > y ? -1 : 1) {
            if ((i % 5 == 2) || (i % 5 == 3)) {
                numeros.add(i);
            }
        }

        if(x>y){
            Collections.reverse(numeros);
        }

        numeros.forEach(System.out::println);

        teclado.close();
    }
}
