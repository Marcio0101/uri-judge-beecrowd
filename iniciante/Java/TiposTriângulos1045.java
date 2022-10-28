package iniciante.java;

import java.util.Scanner;

public class TiposTriângulos1045 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double x,y,z;

        String entrada = teclado.nextLine();
        Double n1 = Double.parseDouble(entrada.split(" ")[0]);
        Double n2 = Double.parseDouble(entrada.split(" ")[1]);
        Double n3 = Double.parseDouble(entrada.split(" ")[2]);



        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a.equals(b) && b.equals(c)) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (!a.equals(b) || !b.equals(c)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        teclado.close();
    }
}
