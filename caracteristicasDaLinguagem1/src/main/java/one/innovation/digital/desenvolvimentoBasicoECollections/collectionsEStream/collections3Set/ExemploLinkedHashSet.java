package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections3Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(2);
        sequenciaNumerica.add(64);
        sequenciaNumerica.add(35);
        sequenciaNumerica.add(23);
        sequenciaNumerica.add(21);
        sequenciaNumerica.add(12);
        sequenciaNumerica.add(2112);
        System.out.println(sequenciaNumerica    );

        System.out.println("Removendo o valor 2112 : " + sequenciaNumerica.remove(2112));

        System.out.println("Retornando o tamanho da sequencia : " + sequenciaNumerica.size());

        System.out.println("Fazendo o Iterator");
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while(iterator.hasNext()){
            System.out.println("Número no iterator : " + iterator.next());
        }

        for (Integer numero:sequenciaNumerica) {
            System.out.println(numero);
            
        }

        System.out.println("Verificando se está vazia : " + sequenciaNumerica.isEmpty());

    }
}
