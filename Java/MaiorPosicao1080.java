package Java;
import java.util.Scanner;

public class MaiorPosicao1080 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int temp = teclado.nextInt();
            if(temp > maior){
                maior = temp;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);
    }
}
