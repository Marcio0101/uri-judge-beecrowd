package iniciante.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();

        valores.add(teclado.nextInt());
        valores.add(teclado.nextInt());
        valores.add(teclado.nextInt());

        valores.stream().sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();
        valores.forEach(System.out::println);
        teclado.close();

    }
}
