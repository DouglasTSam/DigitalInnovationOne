package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario.LocalDate;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioTimes {
    public static void main (String [] args) throws ParseException {

        LocalDateTime horaAgora = LocalDateTime.of(2010,05,15,10,00,00);
        LocalDateTime futuro = horaAgora.plusYears(4).plusMonths(6).plusHours(13);

        DateTimeFormatter formatterAntigo = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        String agoraFormatadoAntigo = horaAgora.format(formatterAntigo);
        System.out.println("Antiga data formatada : " + agoraFormatadoAntigo);

        DateTimeFormatter formatterNovo = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        String agoraFormatadoNovo = futuro.format(formatterNovo);
        System.out.println("Nova data formatada   : " + agoraFormatadoNovo);

    }
}
