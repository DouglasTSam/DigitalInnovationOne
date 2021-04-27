package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections5Comparators.exercicio;

import java.util.Comparator;

public class EstudanteOrdemQntAnimaisReversaCompaarator implements Comparator<EstudanteAnimaisEstimacao> {

    @Override
    public int compare(EstudanteAnimaisEstimacao o1, EstudanteAnimaisEstimacao o2){
        return o2.getAnimaisEstimacao() - o1.getAnimaisEstimacao();
    }
}
