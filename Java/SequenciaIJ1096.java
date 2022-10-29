package Java;

public class SequenciaIJ1096 {
    public static void main(String[] args) {
        int i = 1;
        int contador = 0;
        while (i <= 9) {
            if (i % 2 != 0)
                System.out.println("I=" + i + " J=" + (7 - contador));

            contador++;
            if (contador == 3) {
                contador = 0;
                i++;
            }

        }
    }
}
