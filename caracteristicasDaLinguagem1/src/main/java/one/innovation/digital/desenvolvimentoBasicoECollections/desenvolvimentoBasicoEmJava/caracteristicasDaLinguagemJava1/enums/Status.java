package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.enums;

public enum Status {
    OPEN(13,"Opened"),
    CLOSE(02, "Closed");

    private int cod;
    private String text;

    Status(final int cod, final String text){
        this.cod = cod;
        this.text = text;
    }

    public int getCod(){
        return cod;
    }

    public String getText(){
        return text;
    }

}
