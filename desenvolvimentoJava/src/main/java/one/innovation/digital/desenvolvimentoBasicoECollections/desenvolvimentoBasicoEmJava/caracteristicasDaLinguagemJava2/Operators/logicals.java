package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Operators;

public class logicals {
    public static void main (String [] args){

        final var number = 3;
        final var letter = "A";

        //Sort circuit
        if(number < 5 && letter.equals("A")){
            System.out.println("met the conditions");
        }
        if(number < 5 || letter.equals("A")){
            System.out.println("met the other conditions");
        }

        if((10-3)>2 && (1+3)<9){
            System.out.println("Crazy logic");
        }

        //Non Sort Circuit
        if(verify(15) || verify ("a")){
            System.out.println("OK");
        }else{
            System.out.println("Non OK");
        }
    }

    private static boolean verify(String letter){
        System.out.println("Verifying letter...");
        return letter.equals("a");
    }
    private static boolean verify(Integer number){
        System.out.println("Verifying number...");
        return number > 10;
    }
}
