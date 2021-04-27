package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.construtores.construtorCarroSemParametro;

public class Executor {
    public static void main (String [] args) {

        ConstrutorCarroSemParametro carro = new ConstrutorCarroSemParametro();

        carro.setModelo("Palio");

        System.out.println(carro.getModelo());
    }
}
