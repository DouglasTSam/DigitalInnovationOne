package one.innovation.digital.desenvolvimentoAvancado.aula6NovasFeaturesJava11;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {

        Function<Integer,Double> divisaoPor2 = (var numero) -> numero/2.0;
        System.out.println(divisaoPor2.apply(343));
    }
}
