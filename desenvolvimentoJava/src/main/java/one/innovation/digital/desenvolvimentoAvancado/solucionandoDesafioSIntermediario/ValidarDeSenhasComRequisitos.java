package one.innovation.digital.desenvolvimentoAvancado.solucionandoDesafioSIntermediario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidarDeSenhasComRequisitos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String senha;

        while((senha = br.readLine())!= null){


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
