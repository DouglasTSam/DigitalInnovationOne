package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.polimorfismo;

public class Moto extends Veiculo {

    private String cilindradas;

    public Double calcularImposto(){
        return this.getValorVenal() * 0.03;
    }

    public String getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(String cilindradas){
        this.cilindradas = cilindradas;
    }

}
