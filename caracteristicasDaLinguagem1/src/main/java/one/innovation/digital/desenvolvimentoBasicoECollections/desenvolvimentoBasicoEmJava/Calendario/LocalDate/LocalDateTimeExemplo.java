package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario.LocalDate;

import java.time.LocalDateTime;


public class LocalDateTimeExemplo {
    public static void main (String [] args){

        LocalDateTime horaAgora = LocalDateTime.now();
        LocalDateTime futuro = horaAgora.plusHours(1).plusDays(2).plusSeconds(30);

        System.out.println(horaAgora);
        //2021-04-02T21:13:12.096331300

        System.out.println(futuro);
        //2021-04-04T22:13:42.096331300
    }
}
