package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Others.IMC;

import one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Others.Pessoa.Pessoa;

public class Imc {

        /* MENOR QUE 18.5      MAGREZA        0
           ENTRE 18.5 E 24.9   NORMAL         0
           ENTRE 25.0 E 29.9   SOBREPESO      I
           ENTRE 30.0 E 39.9   OBESIDADE      II
           MAIOR QUE 40.0      OBESIDADE GRAVE III
         */

        public Double calculator (final Pessoa pessoa){
            final var  altura = pessoa.getAltura();
            final var imc = pessoa.getPeso()/(altura * altura);

            return imc;
    }
}