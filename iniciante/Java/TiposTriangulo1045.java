package iniciante.java;
import java.util.Scanner;

public class TiposTriangulo1045 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double a, b, c;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
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
            if (((a.equals(b) && !a.equals(c)) || (!a.equals(b) && a.equals(c)))
                    || ((c.equals(a) && !c.equals(b)) || (!c.equals(a) && c.equals(b)))) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        teclado.close();

    }
}
