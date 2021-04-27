package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Datas;

import java.util.Date;

public class EqualsAndCompareToDate {
    public static void main (String [] args){

        Date dataNoPassado = new Date (1517319139292L);
        System.out.println("data passada : " + dataNoPassado);
        Date dataNoPresente = new Date(1617319139292L);
        System.out.println("data presente : " + dataNoPresente);
        Date mesmaDataNoPresente = new Date(1617319139292L);
        System.out.println("mesma data : " + mesmaDataNoPresente);

        boolean igual = dataNoPresente.equals(mesmaDataNoPresente);
        System.out.println(igual);


        int comparaCaso1 = dataNoPassado.compareTo(dataNoPresente); // passado -> futuro
        int comparaCaso2 = dataNoPresente.compareTo(dataNoPassado); // futuro -> passado
        int comparaCaso3 = dataNoPresente.compareTo(mesmaDataNoPresente); // datas iguais

        System.out.println(comparaCaso1);
        System.out.println(comparaCaso2);
        System.out.println(comparaCaso3);
    }
}
