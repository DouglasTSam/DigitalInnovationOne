package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections7StreamAPI.exercicio;

import jdk.swing.interop.SwingInterOpUtils;
import one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections5Comparators.Estudante;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicio {
    public static void main(String[] args) {

        //Cria a coleção de estudantes
        List<EstudantesExercicio> estudantesComIdade = new ArrayList<>();


        estudantesComIdade.add(new EstudantesExercicio("Pedro", 17));
        estudantesComIdade.add(new EstudantesExercicio("Carlos", 15));
        estudantesComIdade.add(new EstudantesExercicio("Bruno", 21));
        estudantesComIdade.add(new EstudantesExercicio("João", 18));
        estudantesComIdade.add(new EstudantesExercicio("Thiago", 20));
        estudantesComIdade.add(new EstudantesExercicio("George", 42));
        estudantesComIdade.add(new EstudantesExercicio("Larissa", 21));

        System.out.println("*************** Listando os nomes como string ***************\n");
        System.out.println(estudantesComIdade.stream().
                map(item -> item.getNome().toString()).collect(Collectors.joining(", ")));

        System.out.println("*************** Retornando o tamanho da lista ***************\n");
        System.out.println(estudantesComIdade.stream().count());

        System.out.println("*************** Retornando todos que tem idade maior ou igual a 18 ***************\n");
        estudantesComIdade.stream().filter(item -> item.getIdade()>= 18)
                .peek(System.out::println).collect(Collectors.toList());

        System.out.println("*************** Retornando todos os que possuem a letra 'B' no nome ***************\n");
        System.out.println(estudantesComIdade.stream().filter((estudante)->
                estudante.toString().toUpperCase().contains("B")).collect(Collectors.toList()));

        System.out.println("*************** Retornando se existe alguem que possuea a letra 'D' no nome ***************\n");
        System.out.println(estudantesComIdade.stream()
                .anyMatch((nomeComDPresente)->nomeComDPresente.toString().toUpperCase().contains("D")));

        System.out.println("*************** Retornando o mais velho e o mais novo da lista ***************\n");
        estudantesComIdade.sort((first,second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantesComIdade.stream().findFirst());
        estudantesComIdade.sort((first,second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantesComIdade.stream().findFirst());

    }
}