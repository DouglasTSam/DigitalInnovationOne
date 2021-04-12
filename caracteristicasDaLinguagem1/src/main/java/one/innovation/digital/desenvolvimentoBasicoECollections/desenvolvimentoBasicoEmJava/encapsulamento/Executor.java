package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.encapsulamento;

public class Executor {
    public static void main (String [] args ){

        Pessoa eu = new Pessoa("Douglas",15,01,1997);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Douglas Tinoco Samuel");

        System.out.println("Meu novo nome : "+eu.getNome());
    }
}
