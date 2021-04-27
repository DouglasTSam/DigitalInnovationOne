package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections2Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        //adicionando nomes a uma lista de banco
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        System.out.println("Fila recém criada : " + filaBanco);

        System.out.println("((((((((((((((()))))))))))))))");
        //Pegando o primeiro elemento "Cabeça" e removendo-o
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        System.out.println("((((((((((((((()))))))))))))))");
        //Retornando a lista inteira, para verificar o primeiro elemento mas não removido
        String primeiroClienteNaFila = filaBanco.peek();
        System.out.println(primeiroClienteNaFila);
        System.out.println(filaBanco);

        //limpando o QUEUE
        //filaBanco.clear();

        System.out.println("((((((((((((((()))))))))))))))");
        //Retornando a lista caso não esteja vazia, se tiver, estoura uma exceção
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        System.out.println("((((((((((((((()))))))))))))))");
        //Mapeando o elemento com o forEach
        for (String cliente: filaBanco) {
            System.out.println(cliente);
        }

        System.out.println("((((((((((((((()))))))))))))))");
        //Mapeando o elemento com o iterator
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }

        //Retornando o tamanho da filaBanco
        System.out.println(filaBanco.size());

        //Verificando se está vazia
        System.out.println(filaBanco.isEmpty());

        //Limpando a fila e validando que está vazia
        filaBanco.clear();
        System.out.println(filaBanco.isEmpty());
    }
}
