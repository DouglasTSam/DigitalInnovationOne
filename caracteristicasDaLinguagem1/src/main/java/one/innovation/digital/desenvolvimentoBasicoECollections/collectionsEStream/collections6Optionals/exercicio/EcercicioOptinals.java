package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections6Optionals.exercicio;

import java.util.Optional;
import java.util.stream.Collectors;

public class EcercicioOptinals {
    public static void main(String[] args) {

        System.out.println("--------- Criando Optional com valor presente ---------");
        Optional<String> opcionalComString = Optional.of("presente");
        System.out.println(opcionalComString.get());
        System.out.println("*************************************************************\n");


        System.out.println("--------- Exibindo no console se estiver presente ---------");
        opcionalComString.ifPresent(System.out::println);
        System.out.println("*************************************************************\n");


        System.out.println("--------- Transformando o valor se estiver presente e exibindo no console ---------");
        opcionalComString.map((valor) -> valor.concat("AQUI!")).ifPresent(System.out::println);
        System.out.println("*************************************************************\n");


        System.out.println("--------- Se presente pegar o valor do optional e guardar em uma variável ---------");
        if(opcionalComString.isPresent()){
            String valor = opcionalComString.get();

            System.out.println("Valor quando presente : " + valor);
        }
        System.out.println("*************************************************************\n");


        System.out.println("--------- Filtrando se o Optional estiver presente e conter a sigla 'pres'  ---------");
        if(opcionalComString.isPresent()){
            System.out.println(opcionalComString.stream().filter(
                    (opcional)->opcional.toLowerCase().contains("pres")).collect(Collectors.toList()));
        }
        System.out.println("*************************************************************\n");


        System.out.println("--------- Criando um Optional Vazio ---------");
        Optional<String> OpcionalComVazio = Optional.empty();


        System.out.println("--------- Se vazio o Optional mostrar a mensagem de 'Optional vazio' no console ---------");
        if(OpcionalComVazio.isEmpty()){
            System.out.println("Optional vazio");
        }
        System.out.println("*************************************************************\n");


        System.out.println("--------- Criando um Optional Nulo ---------");
        Optional<String> opcionalComNulo = Optional.ofNullable(null);


        System.out.println("--------- Lançando exceção de IllegalStateException por que está vazio ---------");
        System.out.println(OpcionalComVazio.orElseThrow(IllegalStateException::new));
    }
}
