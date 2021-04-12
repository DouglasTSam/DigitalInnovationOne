package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Operators;

public class Relational {
    public static void main (String [] args){
        final var number = 6;

        if( number > 30){
            System.out.println("The number is bigger than 30");
        }else if(number >= 10){
            System.out.println("The number is bigger or equal to 10");
        }else if(number <= 6){
            System.out.println("The number is less than or equal to 6");
        }else{
            System.out.println("none of the above");
        }
    }
}
