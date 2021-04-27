package one.innovation.digital.desenvolvimentoAvancado.solucionandoDesafioSIntermediario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EntrevistaEmbaracosa {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        String palavra;
        String linha;

        while((linha = br.readLine())!= null){
            st = new StringTokenizer(linha);
            palavra =  st.nextToken();
            boolean repetida = false;

            for (int i = 0; i < palavra.length() -1 ; i++) {
                final String inicioPalavra = palavra.substring(0,i);
                final String finalPalavra = palavra.substring(i);

                if(inicioPalavra.endsWith(finalPalavra)){
                    System.out.println(palavra.substring(0,i));
                    repetida = true;
                }
            }
            if (!repetida) System.out.println(palavra);
        }
    }
}
