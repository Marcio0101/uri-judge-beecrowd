import java.util.Scanner;

public class TempoJogoMinutos1047 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer inicio, inicioMinuto, fim, fimMinuto, resultado, resultadoMinuto;

        inicio = teclado.nextInt();
        inicioMinuto = teclado.nextInt();
        fim = teclado.nextInt();
        fimMinuto = teclado.nextInt();

        inicioMinuto = inicioMinuto + (inicio * 60);
        fimMinuto = fimMinuto + (fim * 60);

        resultado = inicioMinuto < fimMinuto ? (inicioMinuto - fimMinuto) * (-1) : (1440 - inicioMinuto) + fimMinuto;

        System.out.println("O JOGO DUROU " + resultado / 60 + " HORA(S) E " + resultado % 60 + " MINUTO(S)");

    }
}
