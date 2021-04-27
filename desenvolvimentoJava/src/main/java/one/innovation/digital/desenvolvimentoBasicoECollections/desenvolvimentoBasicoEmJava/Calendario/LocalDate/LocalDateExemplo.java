package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario.LocalDate;

import java.time.LocalDate;

public class LocalDateExemplo {
    public static void main (String [] args){

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        //2021-04-02

        System.out.println(ontem);
        //2021-04-01
    }
}
