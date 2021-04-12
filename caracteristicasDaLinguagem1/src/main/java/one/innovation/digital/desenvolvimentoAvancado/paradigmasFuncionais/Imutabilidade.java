package one.innovation.digital.desenvolvimentoAvancado.paradigmasFuncionais;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {

        int valor = 20;
        UnaryOperator<Integer> retornaODobro = y -> y * 2;
        System.out.println(retornaODobro.apply(valor));//Retorna o valor dobrado
        System.out.println(valor);//Retorna o valor setado na variável
    }
}
