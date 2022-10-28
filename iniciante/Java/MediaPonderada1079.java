package iniciante.java;

import java.util.Scanner;

public class MediaPonderada1079 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < n; i++) {
            String temp = teclado.nextLine();
            Double n1 = Double.parseDouble(temp.split(" ")[0]);
            Double n2 = Double.parseDouble(temp.split(" ")[1]);
            Double n3 = Double.parseDouble(temp.split(" ")[2]);

            System.out.println(String.format("%.1f", ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10).replace(",", "."));
        }

        teclado.close();
    }
}
