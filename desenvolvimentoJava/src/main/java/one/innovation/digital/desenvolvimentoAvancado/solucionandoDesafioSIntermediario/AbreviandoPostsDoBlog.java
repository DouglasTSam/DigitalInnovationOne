package one.innovation.digital.desenvolvimentoAvancado.solucionandoDesafioSIntermediario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class AbreviandoPostsDoBlog {

    protected static Map<String,Integer> ocorrencias;
    protected static Map<Character,String> abreviacoes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        String texto;

        while (!".".equals(texto = br.readLine())){
            tk = new StringTokenizer(texto);
            ocorrencias = new HashMap<>();
            abreviacoes = new TreeMap<>();

            while(tk.hasMoreElements()){
                String palavra = tk.nextToken();

                if(palavra.length()<=2 || palavra.length() <=5) {
                    continue;
                }

                if (ocorrencias.containsKey(palavra)){
                    ocorrencias.put(palavra, ocorrencias.get(palavra)+1);
                }else{
                    ocorrencias.put(palavra, ocorrencias.get(palavra));
                }

                abreviacoes.put(palavra.charAt(0), comparaPalavras(palavra));
            }
            saida(texto);
        }
    }

    private static String comparaPalavras(String palavra){
        if(!abreviacoes.containsKey(palavra.charAt(0))) return palavra;

        int tamanhoPalavra = ocorrencias.get(palavra) * (palavra.length()-2);
        String palavraAbreviada = abreviacoes.get(palavra.charAt(0));
        int tamPalavra = ocorrencias.get(palavraAbreviada) * (palavraAbreviada.length()-2);

        if (tamanhoPalavra > tamPalavra){
            return palavra;
        }
        else{
            return palavraAbreviada;
        }
    }

    private static void saida(String texto){

        List<String> listaDeAbrevidas = new ArrayList<>();

        for (Character abreaviacao : abreviacoes.keySet()){
            String abreviada = abreviacoes.get(abreaviacao);
            texto = texto.replaceAll(abreviada ,abreaviacao + ".");

            listaDeAbrevidas.add(abreaviacao + ". = " +abreviada);
        }

        System.out.println(texto.trim());
        System.out.println(listaDeAbrevidas.size());
        listaDeAbrevidas.forEach(System.out::println);
    }
}