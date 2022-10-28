package iniciante.Java;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class NotasMoedas {
 
    public static void main(String[] args) throws IOException {
 
        Double[] notasMoedas = { 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };

        Scanner teclado = new Scanner(System.in);
        Double valor = Double.parseDouble(teclado.nextLine().replace(",", "."));
        System.out.println("NOTAS:");
        for (Double notaMoeda : notasMoedas) {
            System.out
                    .println((int) (valor / notaMoeda) + (notaMoeda > 1? " nota":" moeda") + "(s) de R$ "
                            + String.format("%.2f", notaMoeda).replace(",", "."));
            valor = valor % notaMoeda;
            if (notaMoeda == 2.0) {
                System.out.println("MOEDAS:");
            }
        }
        teclado.close();

 
    }
 
}