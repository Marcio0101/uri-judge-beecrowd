package iniciante.java;
import java.util.Scanner;

public class TempoJogo1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer inicio, fim, resultado;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        resultado = inicio < fim ? (inicio - fim) * (-1) : (24 - inicio) + fim;

        System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
        teclado.close();

    }
}
