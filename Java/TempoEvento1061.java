package Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TempoEvento1061 {
        public static void main(String[] args) {
                
                Scanner teclado = new Scanner(System.in);
                String diaInicio, horaInicio, diaFim, horaFim;
                LocalDateTime ldInicio;
                LocalDateTime ldFim;

                diaInicio = teclado.nextLine().replace("Dia ", "");
                horaInicio = teclado.nextLine().replace(" ", "");
                diaFim = teclado.nextLine().replace("Dia ", "");
                horaFim = teclado.nextLine().replace(" ", "");

                ldInicio = LocalDateTime.parse(
                                "2022-04-" + (diaInicio.length() == 1 ? "0" + diaInicio : diaInicio) + " " + horaInicio,
                                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                ldFim = LocalDateTime.parse(
                                "2022-04-" + (diaFim.length() == 1 ? "0" + diaFim : diaFim) + " " + horaFim,
                                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                long dia = ldInicio.until(ldFim, ChronoUnit.DAYS);

                long diferencaSegundos = ldInicio.until(ldFim, ChronoUnit.SECONDS)
                                - (ldInicio.until(ldFim, ChronoUnit.DAYS) * 86400);

                long horas = diferencaSegundos / 3600;
                long minutos = diferencaSegundos % 3600 / 60;
                long segundos = diferencaSegundos % 60;

                System.out.println(dia + " dia(s)\n" + horas + " hora(s)\n" + minutos + " minuto(s)\n" + segundos
                                + " segundo(s)");

        }
}
