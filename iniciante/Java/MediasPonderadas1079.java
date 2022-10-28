package iniciante.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediasPonderadas1079 {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        List<String> lista = new ArrayList<>();

        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            lista.add(teclado.nextLine());
        }

        // lista.forEach((s) -> {
        //     Double n1 = Double.parseDouble(s.split(" ")[0]);
        //     Double n2 = Double.parseDouble(s.split(" ")[1]);
        //     Double n3 = Double.parseDouble(s.split(" ")[2]);

        //     System.out.println(String.format("%.1f", ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10));
        // });
        teclado.close();

    }
}
