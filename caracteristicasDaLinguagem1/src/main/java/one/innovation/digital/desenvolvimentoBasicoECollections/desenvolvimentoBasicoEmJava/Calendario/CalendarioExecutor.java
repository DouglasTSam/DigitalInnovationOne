package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario;

import java.util.Calendar;

public class CalendarioExecutor {
    public static void main (String [] args){
        Calendar agora = Calendar.getInstance();
        System.out.println("Data atual:" + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("Data de 15 dias atrás:" + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("Data de 5 meses para frente: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("Data de 2 anos para frente: " + agora.getTime());
    }
}
