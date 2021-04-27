package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Super;



public class Moto extends Veiculo {

    private String cilindradas;

    public Moto(String marca, String modelo, double valorVenal) {
        super(marca, modelo, valorVenal);
    }

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
