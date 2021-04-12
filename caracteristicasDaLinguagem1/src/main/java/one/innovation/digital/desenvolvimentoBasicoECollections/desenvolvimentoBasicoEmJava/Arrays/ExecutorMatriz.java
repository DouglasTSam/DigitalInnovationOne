package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Arrays;

public class ExecutorMatriz {
    public static void main (String [] args) {

        int [][] meuArrayMultiplo = {{1,2,3,4},{5,6,7,8}};
        for(int i =0; i<meuArrayMultiplo.length; ++i){
            for(int j =0; j<meuArrayMultiplo[i].length; ++j){
                System.out.println(meuArrayMultiplo[i][j]);
            }
        }
    }
}
