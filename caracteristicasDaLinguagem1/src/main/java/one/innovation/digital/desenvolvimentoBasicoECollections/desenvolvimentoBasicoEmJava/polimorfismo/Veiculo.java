package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.polimorfismo;

public class Veiculo {

    private String marca;
    private String modelo;
    private String acelerar;
    private String freiar;
    private Double valorVenal ;

    public Double calcularImposto(){
        return this.valorVenal * 0.01;

    }

    public void setValorVenal(Double valorVenal){
        this.valorVenal = valorVenal;
    }

    public Double getValorVenal(){
        return valorVenal;
    }

    public String setAcelerar(){
        return "Vruum..........vrruuum";
    }

    public String setFreiar(){
        return "Stop";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
