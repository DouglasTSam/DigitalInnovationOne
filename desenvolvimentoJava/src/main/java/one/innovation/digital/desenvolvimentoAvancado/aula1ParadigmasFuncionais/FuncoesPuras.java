package one.innovation.digital.desenvolvimentoAvancado.aula1ParadigmasFuncionais;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> verificaSeMaior =
                (parametro, valorComparacao)-> parametro > valorComparacao;

        System.out.println(verificaSeMaior.test(13,12));
        System.out.println(verificaSeMaior.test(13,12));

    }
}