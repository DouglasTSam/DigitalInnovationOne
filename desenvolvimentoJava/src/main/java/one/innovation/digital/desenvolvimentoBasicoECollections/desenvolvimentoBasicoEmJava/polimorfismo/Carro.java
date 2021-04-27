package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.polimorfismo;

public class Carro extends Veiculo {

    private String numeroDePortas;

    public Double calcularImposto(){
        return this.getValorVenal() * 0.07;
    }

    public String getNumeroDePortas(){
        return numeroDePortas;
    }

    public void setNumeroDePortas(String numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }
}
