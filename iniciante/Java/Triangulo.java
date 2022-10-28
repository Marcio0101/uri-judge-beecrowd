package iniciante.java;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double a, b, c;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Perimetro = " + (a + b + c));
        } else {
            System.out.println("Area = " + (((a + b) * c) / 2)); 
        }
        teclado.close();

    }
}
