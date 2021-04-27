package one.innovation.digital.desenvolvimentoAvancado.aula2InterfaceFuncional;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("Douglas"));

        Function<String,Integer> retornaOValorEmUmaStringECalculaODobro = texto -> Integer.valueOf(texto)*2;
        System.out.println("\n"+retornaOValorEmUmaStringECalculaODobro.apply("30"));
    }
}
