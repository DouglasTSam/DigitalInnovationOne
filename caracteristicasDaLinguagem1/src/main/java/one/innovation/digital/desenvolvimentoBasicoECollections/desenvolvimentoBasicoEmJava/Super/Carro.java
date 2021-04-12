package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Super;

public class Carro extends Veiculo{

    public Carro (String modelo, String marca, double valorVenal){
        super(modelo, marca, valorVenal);
    }

    public Carro (String marca, String modelo, double valorVenal, int numeroDePortas){
        super(modelo, marca, valorVenal);
        this.numeroDePortas = numeroDePortas;
    }

    public int numeroDePortas;

    public int getNumeroDePortas(){
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }

    public Double calcularImposto(){
        return getValorVenal() * 0.07;
    }
}
