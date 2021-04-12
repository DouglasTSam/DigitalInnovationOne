package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDateFormat {
    //Converta a data atual no formato "DD/MM/YYYY HH:MM:SS:MMM"
    public static void main (String [] args){

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy hh:mm:ss:mmm");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
