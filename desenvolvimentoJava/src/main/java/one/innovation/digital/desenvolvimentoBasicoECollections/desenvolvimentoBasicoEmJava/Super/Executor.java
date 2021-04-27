package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Super;

public class Executor {
    public static void main (String [] args){

        Veiculo carro1 = new Carro("Palio", "Fiat",20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat",20000.0);

        System.out.println(carro1.equals(carro2));
    }
}
