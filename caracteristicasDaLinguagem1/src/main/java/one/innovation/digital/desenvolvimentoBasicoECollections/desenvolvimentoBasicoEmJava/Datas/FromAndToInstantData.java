package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Datas;

import java.time.Instant;
import java.util.Date;

public class FromAndToInstantData {
    public static void main (String [] args){

        Date dataInicio = new Date (1517319139292L);
        System.out.println(dataInicio);

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
    }
}
