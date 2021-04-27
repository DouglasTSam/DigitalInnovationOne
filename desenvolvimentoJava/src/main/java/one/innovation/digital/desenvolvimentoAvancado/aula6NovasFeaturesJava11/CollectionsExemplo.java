package one.innovation.digital.desenvolvimentoAvancado.aula6NovasFeaturesJava11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionsExemplo {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Douglas","Tinoco","Samuel");
        System.out.println("Nomes com List e Arrays.asList " + nomes);

        Collection<String> nomesComList = List.of("Douglas","Tinoco","Samuel");
        System.out.println("Nomes com Collection e List " + nomesComList);

        Collection<String> nomeComSet = Set.of("Douglas","Tinoco","Samuel"); // Não pode ter 2 objetos iguais
        System.out.println("Nomes com Collection e Set " + nomeComSet);
    }
}
