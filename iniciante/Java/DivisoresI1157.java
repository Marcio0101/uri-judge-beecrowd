package iniciante.java;

import java.util.Scanner;

public class DivisoresI1157 {
        
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            int entrada = teclado.nextInt();
            
            for (int i = 1; i <= entrada; i++) {
                if (entrada % i == 0) {
                    System.out.println(i);
                }
            }
        }
    
}
