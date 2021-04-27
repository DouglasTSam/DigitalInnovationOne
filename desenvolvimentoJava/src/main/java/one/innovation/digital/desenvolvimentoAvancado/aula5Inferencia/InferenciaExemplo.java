package one.innovation.digital.desenvolvimentoAvancado.aula5Inferencia;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args) throws IOException {
        //connectAndPrintURLJavaOracle();
        printarMeuNome("Douglas", "Tinoco");
        printarSoma(5, 3, 5);
    }
//     Jeito tradicional
//     private static void connectAndPrintURLJavaOracle()throws IOException{

//        URL url = new URL("https://docs.oracle.com/javase/10/language/");
//        URLConnection urlConnection = url.openConnection();
//        BufferedReader bufferedReader = new BufferedReader(
//                new InputStreamReader(urlConnection.getInputStream()));
//
//        System.out.println(bufferedReader.lines().collect(Collectors.joining())
//                .replaceAll(">", ">\n"));
//     }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//        Jeito com inferência
    private static void connectAndPrintURLJavaOracle()throws IOException{
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();
            var bufferedReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));

            System.out.println(bufferedReader.lines().collect(Collectors.joining())
                    .replaceAll(">", ">\n"));
    }

    public static void printarMeuNome(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma (int... numeros){
        int soma;
        if(numeros.length>0){
            soma = 0;
            for (int numero : numeros){
                soma += numero;
            }
            System.out.println("A soma dos valores é : " + soma);
        }
    }
}
