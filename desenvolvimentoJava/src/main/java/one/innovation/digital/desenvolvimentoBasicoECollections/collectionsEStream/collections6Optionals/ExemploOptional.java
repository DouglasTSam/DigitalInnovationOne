package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections6Optionals;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {

        //Declando um valor para o optional
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println(optionalString.isPresent());
        System.out.println("*************************************************************\n");

        //Verificando se o valor está presente (Falso)
        System.out.println(optionalString.isEmpty());
        System.out.println("*************************************************************\n");

        //Verificando se o valor está presente
        optionalString.ifPresent(System.out::println);
        System.out.println("*************************************************************\n");

        //Verificando se o valor está diferente de nulo
        optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("Valor não está presente"));
        System.out.println("*************************************************************\n");

        //Verificando com condicional se o valor está diferente de nulo
        if(optionalString.isPresent()){
            String valor = optionalString.get();

            System.out.println("No condicional IF : " + valor);
        }
        System.out.println("*************************************************************\n");

        //Concatenando o valor que existe no optional com "****" se optional não estiver vazio
        optionalString.map((valor) -> valor.concat(" ****")).ifPresent(System.out::println);
        System.out.println("*************************************************************\n");

        //Limpando o optional para lançar exceção
        //optionalString.ofNullable(null); (Descomenta esta linha apagando o "//")

        //Se optional estiver vazio ele lança exceção
        optionalString.orElseThrow(IllegalStateException::new);
    }
}
