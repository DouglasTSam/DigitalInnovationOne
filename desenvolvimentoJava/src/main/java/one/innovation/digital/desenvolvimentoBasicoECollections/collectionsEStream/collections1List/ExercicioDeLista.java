package one.innovation.digital.collections1.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercicioDeLista {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        //Adicionando 5 nomes na lista
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Exibindo cada nome dentro da lista
        System.out.println("***********************************************");

        for (String nomeNoIndex:nomes) {
            System.out.println("Nomes na lista : " + nomeNoIndex);
        }

        System.out.println("***********************************************");

        //Subistituindo o nome Carlos por Roberto
        nomes.set(2,"Roberto");

        //Retornando o nome que está na posição 1
        System.out.println("Na posição 1 está o Nome : " + nomes.get(1));

        //Sorteando a lista em ordem alfabética
        Collections.sort(nomes);

        //Removendo o nome que está na posição 4
        nomes.remove(4);

        //Removendo o nome João da lista
        nomes.remove("João");

        //Retornando o tamanho da lista
        int tamanhoDaLista = nomes.size();
        System.out.println("Tamanho da lista : " + tamanhoDaLista);

        //Verificando se Juliano está presente na lista
        boolean nomeNaLista = nomes.contains("Juliano");
        System.out.println("Juliano está na lista? : " + nomeNaLista);

        //Criando uma segunda lista de nomes
        List<String> novaListaNomes = new ArrayList<>();

        //Adicionando 2 nomes a essa nova lista e adicionando na lista "nomes"
        novaListaNomes.add("Ismael");
        novaListaNomes.add("Rodrigo");

        Iterator<String> iterator = novaListaNomes.iterator();
        while(iterator.hasNext()){
            nomes.add(iterator.next());
        }

        //Ordenando a lista nomes em ordem alfabética
        Collections.sort(nomes);

        //Verificando se a lista nomes está vazia
        boolean estaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia? : " + estaVazia);

        //Finalizando o exercício e exibindo a lista atualizada e em ordem
        System.out.println("Lista nomes com os novos elementos da segunda lista : " + nomes);
    }
}
