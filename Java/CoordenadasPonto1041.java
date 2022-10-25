package Java;
import java.util.Scanner;

public class CoordenadasPonto1041 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double x = 0.0;
        Double y = 0.0;

        x = teclado.nextDouble();
        y = teclado.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        } else if (y > 0) {
            System.out.println(x > 0 ? "Q1" : "Q2");
        } else {
            System.out.println(x > 0 ? "Q4" : "Q3");
        }
    }
}
