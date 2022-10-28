package iniciante.java;

import java.util.Scanner;

public class Grenais1131 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inter = 0;
        int gremio = 0;
        int empate = 0;
        int opcao;
        do {
            String temp = teclado.nextLine();
            int golInter = Integer.parseInt(temp.split(" ")[0]);
            int golGremio = Integer.parseInt(temp.split(" ")[1]);

            if (golGremio == golInter) {
                empate++;
            } else if (golGremio > golInter) {
                gremio++;
            } else {
                inter++;
            }
            opcao = 0;
            while (opcao < 1 || opcao > 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                opcao = teclado.nextInt();
            }
            teclado.nextLine();

        } while (opcao == 1);
        System.out.println((gremio + inter + empate) + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);
        if (inter == gremio) {
            System.out.println("Nao houve vencedor");
        } else {
            System.out.println((inter > gremio ? "Inter" : "Gremio") + " venceu mais");
        }
        teclado.close();
    }
}
