package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.abstracts;

public class Square extends ClassesAbstractsGeometricForm{
    private String name;
    private Double area;

    public Square(final String name, final Double area){
        this.name = name;
        this.area = area;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Double area() {
        return area;
    }

    @Override
    public String toString(){
        final String builder = "Square [ name = " + name + " area = "+ area+"]";
        return builder.toString();
    }
}
