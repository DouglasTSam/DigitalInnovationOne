package one.innovation.digital.desenvolvimentoAvancado.solucionandoDesafioSIntermediario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EncontreAMaiorSubstring {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String primeiraPalavra, segundaPalavra, min, max; //declare suas variaveis aqui

        while ((primeiraPalavra = in.readLine()) != null) { // complete seu código
            segundaPalavra = in.readLine();

            if (primeiraPalavra.length() > segundaPalavra.length()) {
                max = primeiraPalavra;
                min = segundaPalavra;

            } else {
                max = segundaPalavra;
                min = primeiraPalavra;
            }

            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;

            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }
}