import java.math.BigDecimal;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Double n1, n2, n3, n4, media;
        String valor = teclado.nextLine();
        String[] valores = valor.split(" ");
        n1 = Double.parseDouble(valores[0].replace(",", "."));
        n2 = Double.parseDouble(valores[1].replace(",", "."));
        n3 = Double.parseDouble(valores[2].replace(",", "."));
        n4 = Double.parseDouble(valores[3].replace(",", "."));

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;

        System.out.println("Media: " + (Math.floor(media * 10) / 10));

        if (media > 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            String notaExame = teclado.nextLine();
            System.out.println(
                    "Nota do exame: " + (Math.floor(Double.parseDouble(notaExame.replace(",", ".")) * 10) / 10));
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: "
                    + (((Double.parseDouble(notaExame.replace(",", ".")) + (Math.floor(media * 10) / 10)) / 2)));

        }

    }
}
