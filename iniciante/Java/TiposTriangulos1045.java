package iniciante.java;

import java.util.Scanner;

public class TiposTriangulos1045 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double a,b,c;

        String entrada = teclado.nextLine();
        Double n1 = Double.parseDouble(entrada.split(" ")[0]);
        Double n2 = Double.parseDouble(entrada.split(" ")[1]);
        Double n3 = Double.parseDouble(entrada.split(" ")[2]);

        if(n1 > n2 && n1 > n3){
            if(n2 > n3)
            {
             a = n1;
             b = n2;
             c = n3;
            }
            else
            {
                a = n1;
                b = n3;
                c = n2;
            }
        } else if(n2 > n1 && n2 > n3)
        {
            if(n1 > n3)
            {
                a = n2;
                b = n1;
                c = n3;
            }
            else
            {
                a = n2;
                b = n3;
                c = n1;
            }
        }
        else if(n3 > n1 && n3 > n2)
        {
            if(n1 > n2)
            {
                a = n3;
                b = n1;
                c = n2;
            }
            else
            {
                a = n3;
                b = n2;
                c = n1;
            }
        }
        else
        {
            a = n1;
            b = n2;
            c = n3;
        }



        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a.equals(b) && b.equals(c)) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a.equals(b) || a.equals(c) || b.equals(c)) && (!a.equals(b) || !a.equals(c) || !b.equals(c))) {

                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        teclado.close();
    }
}
