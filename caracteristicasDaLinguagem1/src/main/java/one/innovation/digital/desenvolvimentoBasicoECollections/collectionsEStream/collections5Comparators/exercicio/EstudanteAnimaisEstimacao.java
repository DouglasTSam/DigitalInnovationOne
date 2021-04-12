package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections5Comparators.exercicio;

public class EstudanteAnimaisEstimacao implements Comparable<EstudanteAnimaisEstimacao>{

    private final String nome;
    private final Integer animaisEstimacao;

    public EstudanteAnimaisEstimacao(String nome, Integer animaisEstimacao){
        this.nome = nome;
        this.animaisEstimacao = animaisEstimacao;
    }

    public String getNome(){
        return nome;
    }

    public Integer getAnimaisEstimacao(){
        return animaisEstimacao;
    }

    @Override
    public String toString(){
        return nome + " - " + animaisEstimacao;
    }

    @Override
    public int compareTo(EstudanteAnimaisEstimacao o ){
        return this.getAnimaisEstimacao() - o.getAnimaisEstimacao();
    }

}
