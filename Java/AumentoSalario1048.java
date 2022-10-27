package Java;
import java.util.Scanner;

public class AumentoSalario1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Double salario, novoSalario, reajuste;
        int percentual;

        salario = teclado.nextDouble();
        if (salario <= 400.0) {
            percentual = 15;
        } else if (salario <= 800.0) {
            percentual = 12;
        } else if (salario <= 1200.0) {
            percentual = 10;
        } else if (salario <= 2000.0) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        reajuste = salario * (percentual / 100.0);
        novoSalario = salario + reajuste;

        System.out.println("Novo salario: " + String.format("%.2f", novoSalario).replace(",", "."));
        System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste).replace(",", "."));
        System.out.println("Em percentual: " + percentual + " %");
        teclado.close();

    }
}
