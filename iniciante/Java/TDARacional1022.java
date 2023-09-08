package iniciante.java;

import java.util.Scanner;

public class TDARacional1022 {
    
        public static void main(String[] args) {
    
            Scanner teclado = new Scanner(System.in);
            int casos = teclado.nextInt();
    
            for (int i = 0; i < casos; i++) {
                int n1 = teclado.nextInt();
                char op1 = teclado.next().charAt(0);
                int d1 = teclado.nextInt();
                char op = teclado.next().charAt(0);
                int n2 = teclado.nextInt();
                char op2 = teclado.next().charAt(0);
                int d2 = teclado.nextInt();
    
                int n = 0;
                int d = 0;
    
                switch (op) {
                    case '+':
                        n = (n1 * d2 + n2 * d1);
                        d = (d1 * d2);
                        break;
                    case '-':
                        n = (n1 * d2 - n2 * d1);
                        d = (d1 * d2);
                        break;
                    case '*':
                        n = (n1 * n2);
                        d = (d1 * d2);
                        break;
                    case '/':
                        n = (n1 * d2);
                        d = (n2 * d1);
                        break;
                }
    
                int mdc = mdc(n, d);
    
                System.out.printf("%d/%d = %d/%d\n", n, d, n / mdc, d / mdc);
            }
        }
    
        public static int mdc(int n, int d) {
            if (d == 0) {
                return n;
            } else {
                return mdc(d, n % d);
            }
        }
    
}
