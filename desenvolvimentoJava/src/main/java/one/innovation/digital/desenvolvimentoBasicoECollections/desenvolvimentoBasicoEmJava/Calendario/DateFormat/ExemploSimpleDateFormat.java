package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploSimpleDateFormat {
    public static void main (String [] args){

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        //02/04/2021
    }
}
