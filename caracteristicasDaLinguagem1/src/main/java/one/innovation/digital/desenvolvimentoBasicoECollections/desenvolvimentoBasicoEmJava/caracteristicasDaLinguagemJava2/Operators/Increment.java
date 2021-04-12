package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Operators;

public class Increment {
    public static void main (String [] args){

        var number = 1;

        for(int i = 1 ; number<=5; i++){
            System.out.println(number++);//or System.out.println(number); number += 1;
        }

        var variable = 10;
        System.out.println(variable --);
        System.out.println(variable);
    }
}
