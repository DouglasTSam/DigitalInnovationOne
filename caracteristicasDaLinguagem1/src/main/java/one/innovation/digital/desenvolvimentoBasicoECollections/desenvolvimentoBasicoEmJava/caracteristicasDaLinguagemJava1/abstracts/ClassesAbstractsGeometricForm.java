package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.abstracts;

public abstract class ClassesAbstractsGeometricForm {
    public abstract String  name();
    public abstract Double area();

    public String draw (int x , int y){
        return "Drawing X="+x +" Y:"+y;
    }
}
