package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Carro;

public class Carro {

    private String nome;
    private int quantidadePessoasDentro;
    private int quantidadePessoasQueEntraram;
    private int quantidadePessoasQueSairam;

    public Carro(final String nome,final int quantidadePessoasDentro,final int quantidadePessoasQueEntraram,final int quantidadePessoasQueSairam ){
        this.nome = nome;
        this.quantidadePessoasDentro = quantidadePessoasDentro;
        this.quantidadePessoasQueEntraram = quantidadePessoasQueEntraram;
        this.quantidadePessoasQueSairam = quantidadePessoasQueSairam;
    }
    public String getNome(){
        return nome;
    }

    public int getQuantidadePessoasDentro(){
        return quantidadePessoasDentro;
    }

    public int  getQuantidadePessoasQueEntraram(){
        return quantidadePessoasQueEntraram;
    }

    public int  getQuantidadePessoasQueSairam(){
        return quantidadePessoasQueSairam;
    }

    public String totalNoCarro(){
        int dentro = getQuantidadePessoasDentro();
        return ("Há atualmente no carro " + dentro + " pessoas");
    }

    public String totalEntrouNoCarro(){
        int dentro = getQuantidadePessoasDentro();
        int entrou = getQuantidadePessoasQueEntraram();
        int total = dentro+entrou;
        return ("Entrou no carro " + entrou + " pessoas, e agora há " + total+ " dentro");
    }

    public String tatalSaiuDoCarro(){
        int dentro = getQuantidadePessoasDentro();
        int saiu = getQuantidadePessoasQueSairam();
        int total = dentro+saiu;
        return ("Saiu do carro " + saiu + " pessoas, e agora há " + total+" dentro");
    }
}
