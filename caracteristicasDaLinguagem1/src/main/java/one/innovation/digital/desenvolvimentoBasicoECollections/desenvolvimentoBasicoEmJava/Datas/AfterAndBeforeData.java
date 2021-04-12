package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Datas;

import java.util.Date;

public class AfterAndBeforeData {
    public static void main (String [] args){


        Date dataNoPassado = new Date (1517319139292L);
        Date dataNoPresente = new Date(1617319139292L);

        boolean dataPassadoMaior= dataNoPassado.after(dataNoPresente);
        System.out.println(dataPassadoMaior);

        boolean dataAtualMaior = dataNoPassado.before(dataNoPresente);
        System.out.println(dataAtualMaior);
    }
}
