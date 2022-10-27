package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaImparesConsecutivos1099 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> somas = new ArrayList<>();
        int n = 0;

        n = teclado.nextInt();
        //eviter erro por lixo;
        teclado.nextLine();

        for (int i = 0; i < n; i++) {
            String temp = teclado.nextLine();

            int x = Integer.parseInt(temp.split(" ")[0]);
            int y = Integer.parseInt(temp.split(" ")[1]);
            int z = x;
            int soma = 0;
            while ((x > y && z > y) || (x < y && z < y)) {
                if (z % 2 != 0 && z != x) {
                    soma += z;
                }

                z += x > y ? -1 : 1;
            }
            somas.add(soma);
        }
        
        
        somas.forEach(System.out::println);
        
        teclado.close();
    }
}
