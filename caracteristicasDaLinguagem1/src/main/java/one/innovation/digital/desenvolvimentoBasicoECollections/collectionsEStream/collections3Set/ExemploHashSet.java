package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections3Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        //Adicionando notas no set
        notasAlunos.add(5.6);
        notasAlunos.add(9.8);
        notasAlunos.add(5.8);
        notasAlunos.add(4.9);
        notasAlunos.add(5.7);
        notasAlunos.add(1.2);
        notasAlunos.add(3.2);
        notasAlunos.add(9.2);

        System.out.println("(((((((((((((((((((()))))))))))))))))))))");
        System.out.println("Imprimindo as notas : " + notasAlunos);

        System.out.println("(((((((((((((((((((()))))))))))))))))))))");
        System.out.println("Removendo a nota 1.2 do aluno : " + notasAlunos.remove(1.2));

        System.out.println("(((((((((((((((((((()))))))))))))))))))))");
        System.out.println("Retornando o tamanho da lista de notas : " + notasAlunos.size());

        System.out.println("(((((((((((((((((((()))))))))))))))))))))");
        Iterator<Double> iterator = notasAlunos.iterator();
        while(iterator.hasNext()){
            System.out.println("Notas no iterator : " + iterator.next());
        }

        notasAlunos.add(23.0);
        System.out.println(notasAlunos);

        System.out.println("(((((((((((((((((((()))))))))))))))))))))");
        for (Double nota : notasAlunos) {
            System.out.println("Notas no forEach : " + nota);
        }

        notasAlunos.add(44.0);
        System.out.println(notasAlunos);

        System.out.println("(((((((((((((((((((()))))))))))))))))))))");
        System.out.println("Limpando a lista : ");
        notasAlunos.clear();
        System.out.println("Verificando se está vazio : " + notasAlunos.isEmpty());
    }
}
