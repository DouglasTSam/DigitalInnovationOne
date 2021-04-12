package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections3Set.exercicio;

import java.util.TreeSet;

public class ExercicioSet {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(3);
        numbers.add(88);
        numbers.add(20);
        numbers.add(44);
        numbers.add(3);
        System.out.println("Exibindo lista : " + numbers);

        System.out.println("****************************************");
        for (Integer numero : numbers) {
            System.out.println("Dentro do forEach : " + numero);
        }

        System.out.println("****************************************");
        System.out.println(numbers.remove(3));
        System.out.println("Exibindo lista sem o número 3 : " + numbers);

        System.out.println("****************************************");
        System.out.println(numbers.add(23));
        System.out.println("Exibindo lista com o novo número 23 : " + numbers);

        System.out.println("****************************************");
        System.out.println("Exibindo o tamanho da lista : " + numbers.size());

        System.out.println("Exibindo se a lista está vazia: " +  numbers.isEmpty());


    }
}
