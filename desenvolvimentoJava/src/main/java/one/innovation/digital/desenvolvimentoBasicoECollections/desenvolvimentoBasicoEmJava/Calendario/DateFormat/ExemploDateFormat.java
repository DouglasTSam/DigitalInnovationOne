package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario.DateFormat;

import java.text.DateFormat;
import java.util.Date;

public class ExemploDateFormat {
    public static void main (String [] args){

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        //EX: 02/04/2021 20:57

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        //EX: 02 de abril de 2021 20:57

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        //EX: 02 de abril de 2021 20:57:31 BRT
    }
}
