package iniciante.java;
import java.util.Scanner;

public class Multiplos1044 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer a, b;

        a = teclado.nextInt();
        b = teclado.nextInt();

        System.out.println(a % b == 0 || b % a == 0 ? "Sao Multiplos" : "Nao sao Multiplos");
        teclado.close();
    
    }
}
