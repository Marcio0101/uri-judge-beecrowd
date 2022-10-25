package Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ddd1050 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer entrada;
        String saida;
        Map<Integer, String> lista = new HashMap<>();
        lista.put(61, "Brasilia");
        lista.put(71, "Salvador");
        lista.put(11, "Sao Paulo");
        lista.put(21, "Rio de Janeiro");
        lista.put(32, "Juiz de Fora");
        lista.put(19, "Campinas");
        lista.put(27, "Vitoria");
        lista.put(31, "Belo Horizonte");

        entrada = teclado.nextInt();

        saida = lista.get(entrada);
        System.out.println(saida != null ? saida : "DDD nao cadastrado");
    }
}
