package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Super;

import java.util.Objects;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private String acelerar;
    private String freiar;
    private Double valorVenal ;

    public Double calcularImposto(){
        return this.valorVenal * 0.01;
    }
    public Veiculo (String marca, String modelo, double valorVenal){
        this.marca = marca;
        this.modelo = modelo;
        this.valorVenal = valorVenal;
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

   /* @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        Veiculo comparavel;

        if(obj instanceof Veiculo){
            comparavel = (Veiculo)obj;
        }else {
            return false;
        }
        if(comparavel.marca == this.marca && comparavel.modelo == this.modelo && comparavel.valorVenal == this.valorVenal){
            return true;
        }
        return false;
    }*/

    @Override
    public int hashCode(){
        return Objects.hash(modelo, marca, valorVenal);
    }
}
