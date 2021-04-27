package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.heranca;

public class Veiculo {

    private String marca;
    private String modelo;
    private String acelerar;
    private String freiar;


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
