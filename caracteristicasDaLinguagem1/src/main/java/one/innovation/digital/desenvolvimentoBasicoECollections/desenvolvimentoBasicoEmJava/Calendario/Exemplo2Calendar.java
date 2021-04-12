package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario;

import java.util.Calendar;

public class Exemplo2Calendar {
    public static void main (String [] args){
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //diaSemana Mês diaDoMês Hora Ano = EX: sex abr 02 19:23:25 BRT 2021

        System.out.printf("%tF\n", agora);
        //Ano-Mês-Dia = EX: 2021-04-02

        System.out.printf("%tD\n",agora);
        //Mês-Dia-Ano = EX: 04/02/21

        System.out.printf("%tr\n",agora);
        //Horas formato 12H = EX: 07:23:25 PM

        System.out.printf("%tT\n",agora);
        //Horas formato 24H EX: 19:23:25

    }
}
