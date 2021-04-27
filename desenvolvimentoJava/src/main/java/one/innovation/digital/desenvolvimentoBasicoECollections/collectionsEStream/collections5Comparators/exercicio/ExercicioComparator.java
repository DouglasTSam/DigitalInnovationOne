package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections5Comparators.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparator {
    public static void main(String[] args) {

        List<EstudanteAnimaisEstimacao> estudantesEAnimais = new ArrayList<>();

        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("Pedro", 2));
        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("Carlos", 2));
        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("Mariana", 4));
        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("João", 1));
        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("Thiago", 3));
        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("George", 7));
        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("Larissa", 5));
        System.out.println("+++++++++++++++++++++ Ordem de inserção na lista +++++++++++++++++++++\n");
        System.out.println(estudantesEAnimais);

        //Ordenando com java.util.comparator
        estudantesEAnimais.sort(Comparator.comparingInt(EstudanteAnimaisEstimacao::getAnimaisEstimacao));
        System.out.println(" ++++++ Ordem natural dos números - quantidade de animais de estimação (method reference) +++++++\n");
        System.out.println(estudantesEAnimais);

        //Adicionando novo elemento e ordenando com comparable
        estudantesEAnimais.add(new EstudanteAnimaisEstimacao("Renata", 3));
        Collections.sort(estudantesEAnimais);
        System.out.println(" ++++++ Ordenando novamente e implemento novo elemento e ordenando com comparable +++++++\n");
        System.out.println(estudantesEAnimais);

        //Ordenando com uma função função lambda
        estudantesEAnimais.sort((nome,animais) -> nome.getAnimaisEstimacao() - animais.getAnimaisEstimacao());
        System.out.println("+++++ Ordem natural dos números - quantidade de animais de estimação +++++\n");
        System.out.println(estudantesEAnimais);

        //Ordenando com metodo referencia Comparator reversed
        estudantesEAnimais.sort(Comparator.comparingInt(EstudanteAnimaisEstimacao::getAnimaisEstimacao).reversed());
        System.out.println(" ++++++ Ordem reversa dos números - quantidade de animais de estimação (method reference) +++++++\n");
        System.out.println(estudantesEAnimais);

    }
}
