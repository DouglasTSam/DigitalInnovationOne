package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Others;

import one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Others.IMC.Imc;
import one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Others.Pessoa.Pessoa;

public class Program {
    public static void main (String [] args){

        final Pessoa pessoa = new Pessoa( "Douglas", 1.73, 84.6);

        final var calculadora = new Imc();
        final var imc = calculadora.calculator(pessoa);

        System.out.printf("IMC = %.2f" ,imc);
    }
}
