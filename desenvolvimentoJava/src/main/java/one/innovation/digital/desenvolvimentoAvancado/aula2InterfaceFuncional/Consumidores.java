package one.innovation.digital.desenvolvimentoAvancado.aula2InterfaceFuncional;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
//        -apenas utilizar o parâmetro da forma que ele foi recebido

       // Consumer<String> imprimirUmaFrase = System.out::println;  OU
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
