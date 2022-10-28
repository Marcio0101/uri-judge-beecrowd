package Java;

import java.util.Scanner;

public class TipoCombustivel1134 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo = 0;

        while (codigo != 4) {
            codigo = teclado.nextInt();

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    break;
            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        teclado.close();
    }
}
