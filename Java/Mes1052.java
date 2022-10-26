package Java;

import java.util.Scanner;

public class Mes1052 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int mes = teclado.nextInt();

        System.out.println(meses[mes - 1]);

    }
}
