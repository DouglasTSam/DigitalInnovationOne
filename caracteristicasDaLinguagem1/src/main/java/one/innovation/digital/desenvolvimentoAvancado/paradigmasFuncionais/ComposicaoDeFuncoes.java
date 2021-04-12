package one.innovation.digital.desenvolvimentoAvancado.paradigmasFuncionais;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {

        int [] valores = {1,2,3,4,60,30,23,22};
        Arrays.stream(valores).filter(numero -> numero %2 == 0)
                .map(numero -> numero *2)
                .forEach(numero -> System.out.println(numero));
    }
}
