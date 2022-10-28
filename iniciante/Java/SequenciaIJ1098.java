package iniciante.java;

import java.text.DecimalFormat;

public class SequenciaIJ1098 {
    public static void main(String[] args) {
        Double i = 0.0;
        Double contador = 1.0;
        while (i <= 2) {
            System.out.println(
                    ("I=" + new DecimalFormat("0.#").format(i) + " J=" + new DecimalFormat("0.#").format(contador + i))
                            .replace(",", "."));

            contador++;
            if (contador > 3) {
                i += 0.2;
                contador = 1.0;
            }
        }
    }
}
