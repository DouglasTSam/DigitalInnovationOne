package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections2Queue.exercicio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioLinked {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Adicionando 5 nomes na lista
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        //Mepeando cada nome na fila com interator
        Iterator<String> iteratorFila = fila.iterator();
        while(iteratorFila.hasNext()){
            System.out.println("Nome na lista do iterator : " + iteratorFila.next());
        }

        //Verificando o primeiro nome sem remove-lo
        System.out.println("Primeiro elemento sem remover : " + fila.peek());

        //Verificando o primeiro nome e removendo o mesmo
        System.out.println("Primeiro elemento removendo : " + fila.poll());
        System.out.println("Exibindo a fila : " + fila);

        //Adicionando um novo nome na lista, e verificando a posição que ele assumiu
        fila.add("Daniel");
        System.out.println("Verifindo a fila depois de adicionar um novo nome : " + fila);

        //Retornando o tamanho atual da fila
        System.out.println("Tamanho da fila : " + fila.size());

        //Verificando se a fila está vazia
        System.out.println("Se a fila está vazia : " + fila.isEmpty());

        //Verificando se na fila existe um Carlos
        System.out.println("Se na fila existe algum 'Carlos' : " + fila.contains("Carlos"));
    }
}
