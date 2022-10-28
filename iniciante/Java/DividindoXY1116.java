package iniciante.java;

import java.util.Scanner;

public class DividindoXY1116 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < n; i++) {
            String temp = teclado.nextLine();
            Double x = Double.parseDouble(temp.split(" ")[0]);
            Double y = Double.parseDouble(temp.split(" ")[1]);

            if (y != 0) {
                System.out.println(String.format("%.1f", x / y).replace(",", "."));
            } else {
                System.out.println("divisao impossivel");
            }
        }

        teclado.close();
    }
}
