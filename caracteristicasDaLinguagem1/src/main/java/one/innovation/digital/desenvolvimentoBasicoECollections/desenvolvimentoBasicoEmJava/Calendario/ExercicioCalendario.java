package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Calendario;

import java.text.ParseException;
import java.util.Calendar;

public class ExercicioCalendario {
    public static void main (String [] args) throws ParseException {

        Calendar agora = Calendar.getInstance();
        agora.set(Calendar.DAY_OF_MONTH, 3);
        var dataVencimento = agora.get(Calendar.DAY_OF_MONTH);
        System.out.println("************************************************\nDia de vencimento da parcela : Dia " + dataVencimento + " de cada mês");

        agora.add(Calendar.DATE, 10);
        var getDataFim = agora.get(Calendar.DAY_OF_MONTH);
        var getDiaSemanaDataFim = agora.get(Calendar.DAY_OF_WEEK);

        if(getDiaSemanaDataFim == 1){
                getDataFim ++;
            System.out.println("************************************************\nNova data final para quitação da parcela : " + getDataFim+"\n************************************************");
            }else if(getDiaSemanaDataFim == 7){
                getDataFim = getDataFim + 2;
                System.out.println("************************************************\nNova data final para quitação da parcela : " + getDataFim+"\n************************************************");
            }else{
            System.out.println("************************************************\nDia limite para pagamento : " + getDataFim+ "\n************************************************");
        }
    }
}
