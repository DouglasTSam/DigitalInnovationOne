package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Fors;

import java.util.stream.IntStream;

public class For {
    public static void main (String [] args){

        for (int i = 0; i <= 3; i++){//or i+1
            System.out.println("I = " + i);
        }


        IntStream.of(1,2,3,4,5).forEach(n->{
            System.out.println(n);
        });

        IntStream.range(1,4).forEach(n->{
            System.out.println("Number : " + n);
        });
    }
}
