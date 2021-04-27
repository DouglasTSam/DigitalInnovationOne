package one.innovation.digital.desenvolvimentoAvancado.aula6NovasFeaturesJava11;

import java.util.function.Function;

public class StringRepeatExemplo {
    public static void main(String[] args) {
// Método antigo

        String nome = ",Douglas";
        String aux = " ";

        for (int i = 0; i <10  ; i++) {
            aux += nome;
        }
        System.out.println("Método antigo : " + aux);

        System.out.println("\nMétodo novo : " + nome.repeat(10));
    }
}
