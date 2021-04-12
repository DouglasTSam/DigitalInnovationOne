package one.innovation.digital.collections1.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        //Adicionando 6 nomes na lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Douglas");

        //Alterando o valor na posição 1
        nomes.set(1,"Jonathan");
        System.out.println("Incluindo um nome : " + nomes);

        //Ordenando a lista em ordem alfabética
        Collections.sort(nomes);
        System.out.println("Ordem alfabética : " + nomes);

        //Removendo um valor pelo index da lista
        nomes.remove(2);
        System.out.println("Removendo um index : " + nomes);

        //Removendo um valor pelo elemento
        nomes.remove("Maria");
        System.out.println("Removendo um elemento : " + nomes);

        //Retornando um valor pelo index
        String nome = nomes.get(1);
        System.out.println("Pegando um elemento pelo index : " + nome);

        //Retornando a posição de um elemento presente na lista
        int posicao = nomes.indexOf("Douglas");
        System.out.println("Posição de um elemento na lista : " + posicao);// quando não existe na lista o index vem como -1

        //Retorna o tamanho atual da lista
        int tamanho = nomes.size();
        System.out.println("Pegando o tamanho da lista : " + tamanho);

        //Removendo um valor e atualizando o tamanho da lista
        nomes.remove("Juliana");
        tamanho = nomes.size();
        System.out.println(tamanho);

        //Verificando se o elemento está presente na lista
        boolean temONome = nomes.contains("Douglas");
        System.out.println("Verificando se há o elemento na lista : " + temONome);

        //Verificando se a lista está vazia retornando true/false
        boolean vazio = nomes.isEmpty();
        System.out.println("Verificando se a lista está vazia : " + vazio);

        //Mapeando toda a lista e exibindo o nome primeiro é a declaração de uma variavel e segundo a lista
        for (String nomeItem : nomes) {
            System.out.println("Nome do item no for : " + nomeItem);
        }

        //Mapenado a lista com o interator/hasNext()= retorna true enquanto haver um próximo elemento na lista
        //next()= pega o elemento atual que está na lista
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("Nome com interator : " + iterator.next());
        }

        //Limpando a lista
        nomes.clear();//limpa a lista

        //Verificando se está vazia novamente
        vazio = nomes.isEmpty();
        System.out.println("Verificando novamente se vazia : " + vazio);

        nomes.addAll(nomes);
        System.out.println(nomes);
    }
}
