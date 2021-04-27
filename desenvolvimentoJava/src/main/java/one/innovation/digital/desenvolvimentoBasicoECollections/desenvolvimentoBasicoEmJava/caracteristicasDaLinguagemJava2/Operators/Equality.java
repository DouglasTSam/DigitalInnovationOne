package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Operators;

public class Equality {
    public static void main (String [] args){

        var number = 11;

        if(number ==10){
            System.out.println("The Number is 10");
        }else{
            System.out.println("The Number isn't 10");
        }

        if(number != 10){
            System.out.println("The Number isn't 10");
        }else{
            System.out.println("The Number is 10");
        }


        final var letter = "D";

        if ("S".equals(letter)){
            System.out.println("The Letter is S");
        }else{
            System.out.println("The Letter isn't S");
        }
        if(!letter.equals("D")){
            System.out.println("The Letter isn't D");
        }else{
            System.out.println("The Letter is D");
        }
    }
}
