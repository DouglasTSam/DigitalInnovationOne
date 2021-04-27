package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.While;

public class Whiles {
    public static void main (String [] args){

        var x = 0;

        while (x < 1){
            System.out.println("Into of while.. ");
            System.out.println(x);
            x++;
            System.out.println(x);
        }

        var y = 1;

        do{
            System.out.println("Into of do/while.. ");
            System.out.println(y);
        }while(y++ < 2);
    }
}
