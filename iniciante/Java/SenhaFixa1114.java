package iniciante.java;

import java.util.Scanner;

public class SenhaFixa1114 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Boolean isValido = false;
        while (!isValido) {
            if (teclado.nextLine().equals("2002")) {
                isValido = true;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        System.out.println("Acesso Permitido");

        teclado.close();
    }
}
