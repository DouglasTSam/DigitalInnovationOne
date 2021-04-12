package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Datas;

import java.util.Date;

public class Executor {
    public static void main (String [] args){

        Date newDate = new Date();

        System.out.println("data sem parametro : " + newDate);

        long currentTimeMillis = System.currentTimeMillis();

        System.out.println("Milissegundos atualmente : " + currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        System.out.println("data com parametro : " + novaData);
    }
}
