package iniciante.java;

public class SequeciaSII1156 {
    
            public static void main(String[] args) {
        
                double s = 0;
        
                for (int i = 1, j = 1; i <= 39; i += 2, j *= 2) {
                    s += (double) i / j;
                }
        
                System.out.printf("%.2f\n", s);
            }
    
}
