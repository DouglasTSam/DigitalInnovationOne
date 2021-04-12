package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.IFS;

public class IF {
    public static void main (String [] args){

        final var condition =  false;

        if(condition){
            System.out.println("The condition is true");
        }else{
            System.out.println("The condition is false");
        }

        if(condition){
            System.out.println("A unique line");
        }
        final var ternary = condition ? " is True" : "is False";
        System.out.println(ternary);
    }
}
