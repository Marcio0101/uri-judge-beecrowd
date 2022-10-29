package iniciante.java;

public class SequenciaIJ1097 {
    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        int contador = 0;
        while (i <= 9) {
            if (i % 2 != 0)
                System.out.println("I=" + i + " J=" + (j - contador));

            contador++;
            if (contador == 3) {
                if (i % 2 != 0)
                    j += 2;
                contador = 0;
                i++;
            }

        }
    }
}
