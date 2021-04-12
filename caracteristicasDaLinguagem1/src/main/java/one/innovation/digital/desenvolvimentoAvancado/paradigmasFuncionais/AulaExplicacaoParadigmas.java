package one.innovation.digital.desenvolvimentoAvancado.paradigmasFuncionais;

import java.util.function.UnaryOperator;

public class AulaExplicacaoParadigmas {
    public static void main(String[] args) {
        //Paradigma Imperativo
        /*
            int valor = 10;//1 instrução
            int resultado = valor * 3;//+1 instrução
            System.out.println("O resultado da operação é : " + resultado);//1+ instrução
        */

        //Paradigma Funcional
        UnaryOperator<Integer> calculaValorVezes3 = valor -> valor * 3;//um conceito de paradigma funcional ou programação funcional
        int valor = 10;
        System.out.println("O valor é : " + calculaValorVezes3.apply(valor));
    }
}
