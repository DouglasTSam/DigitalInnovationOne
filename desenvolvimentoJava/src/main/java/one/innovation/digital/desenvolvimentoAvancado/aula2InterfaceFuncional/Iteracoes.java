package one.innovation.digital.desenvolvimentoAvancado.aula2InterfaceFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {

        String[] nomes = {"Douglas", "Giulia","Alan","Romulo"};
        Integer[] numeros = {2,3,5,7,8,20};
//        imprimirNomesFiltrados(nomes);
//        imprimirTodosOsNomes(nomes);
//        imprimirODobroDeCadaItemDaLista(numeros);   DESCOMENTE PARA PODER VIZUALIZAR O RESULTADO


        List<String> profissoesTI = new ArrayList<>();
        profissoesTI.add("Desenvolvedor");
        profissoesTI.add("Tester");
        profissoesTI.add("Gerente de projeto");
        profissoesTI.add("Gerente de qualidade");

        profissoesTI.stream().filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){

        //Método tradicional

        String nomeParaImprimir = "";
        for(int i=0; i<nomes.length; i++){
            if(nomes[i].equals("Romulo")){
                nomeParaImprimir += " "+nomes[i];
            }
        }
        System.out.println("Nome filtrado no for tradicional : " + nomeParaImprimir + "\n");


        //Método após java 8
        Stream.of(nomes).filter(nome -> nome.equals("Romulo"))
                .collect(Collectors.joining()); // Separa cada valor com espaço

        System.out.println("Nome filtrado com Stream : " + nomeParaImprimir);
        System.out.println("\n************************************************\n");
    }

    public static void imprimirTodosOsNomes(String... nomes){
        for(String nome : nomes){
            System.out.println("Nome impresso pelo for :" + nome);
        }
        System.out.println("\n************************************************\n");

//      Stream.of(nomes).forEach(System.out::println);  OU
        Stream.of(nomes).forEach(nome -> System.out.println("Nome impresso pelo forEach do Stream :" + nome));
        System.out.println("\n************************************************\n");
    }

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println("Numero multiplicado no for : " + numero * 2);
        }
        System.out.println("\n************************************************\n");

//      Stream.of(numeros).forEach(System.out::println);  OU
//        Stream.of(numeros).map(numero -> numero*2).forEach(System.out::println);
        Stream.of(numeros).forEach(numero -> System.out.println("Numero multiplicado forEach do Stream : " + numero * 2));
    }
}
