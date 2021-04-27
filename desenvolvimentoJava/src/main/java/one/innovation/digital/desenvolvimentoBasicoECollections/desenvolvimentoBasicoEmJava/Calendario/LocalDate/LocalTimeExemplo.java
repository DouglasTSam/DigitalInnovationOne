package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario.LocalDate;

import java.time.LocalTime;

public class LocalTimeExemplo {
    public static void main (String [] args){

        LocalTime horaAgora = LocalTime.now();
        LocalTime horaAMais = horaAgora.plusHours(1);

        System.out.println(horaAgora);
        //21:09:04.729690700

        System.out.println(horaAMais);
        //22:09:04.729690700
    }

}
