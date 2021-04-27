package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections6Optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
//Option " Genérico "
        //Declarando que um valor para o option que não está mais vazio
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("*************************************************************\n");
        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente"));

        //Declarando que um valor para o option que agora está vazio
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("*************************************************************\n");
        System.out.println("Valor opcional que não está presente 1");
        optionalNull.ifPresentOrElse(System.out::println,() -> System.out.println("null = não está presente"));

        //Declarando que o option que está vazio
        Optional<String>emptyOptional = Optional.empty();
        System.out.println("*************************************************************\n");
        System.out.println("Valor opcional que não está presente 2");
        emptyOptional.ifPresentOrElse(System.out::println,() -> System.out.println("empty = não está presente"));

        //Declarando que um valor nulo para o option que exibira nullPointerException
        Optional<String>optionalNullErro = Optional.of(null);
        System.out.println("*************************************************************\n");
        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println,() -> System.out.println("erro = não está presente"));
    }
}
