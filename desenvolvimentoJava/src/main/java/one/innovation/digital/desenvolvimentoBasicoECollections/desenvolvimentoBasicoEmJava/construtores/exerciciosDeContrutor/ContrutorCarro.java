package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.construtores.exerciciosDeContrutor;

public class ContrutorCarro {

    private String marca;
    private String modelo;
    private String ano;
    private String varianteCor;

    public ContrutorCarro(String marca, String modelo, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getVariante(){
        return varianteCor;
    }
    public void setVariante(String varianteCor){
        this.varianteCor = varianteCor;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno(){
        return ano;
    }

    public void setCarro(String marca, String modelo, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

}
