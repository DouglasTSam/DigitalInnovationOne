package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections7StreamAPI.exercicio;

import one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections5Comparators.Estudante;

public class EstudantesExercicio implements Comparable<Estudante>{

    private final String nome;
    private final Integer idade;

    public EstudantesExercicio(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    @Override
    public String toString(){
        return nome + " - " + idade;
    }

    @Override
    public int compareTo(Estudante o ){
        return this.getIdade() - o.getIdade();
    }
}

