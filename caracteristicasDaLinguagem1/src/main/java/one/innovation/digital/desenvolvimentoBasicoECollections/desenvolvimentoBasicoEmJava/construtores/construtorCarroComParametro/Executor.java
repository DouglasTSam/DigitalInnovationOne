package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.construtores.construtorCarroComParametro;

public class Executor {
    public static void main (String [] args) {

        ContrutorCarroComParametro carroMarca = new ContrutorCarroComParametro("Fiat");

        System.out.println(carroMarca.getMarca());
    }
}
