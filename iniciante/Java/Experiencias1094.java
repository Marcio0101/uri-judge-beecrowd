package Java;

import java.util.Scanner;

public class Experiencias1094 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double c = 0.0;
        Double r = 0.0;
        Double s = 0.0;
        int n = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < n; i++) {
            String entrada = teclado.nextLine();
            int cobaias = Integer.parseInt(entrada.split(" ")[0]);
            String tipo = entrada.split(" ")[1];

            switch (tipo) {
                case "C":
                    c += cobaias;
                    break;
                case "R":
                    r += cobaias;
                    break;
                case "S":
                    s += cobaias;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Total: " + (int) (c + r + s) + " cobaias");
        System.out.println("Total de coelhos: " + c.intValue());
        System.out.println("Total de ratos: " + r.intValue());
        System.out.println("Total de sapos: " + s.intValue());
        System.out.println("Percentual de coelhos: " + String.format("%.2f", (c / (c + r + s)) * 100) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", (r / (c + r + s)) * 100) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", (s / (c + r + s)) * 100) + " %");

        teclado.close();
    }
}
