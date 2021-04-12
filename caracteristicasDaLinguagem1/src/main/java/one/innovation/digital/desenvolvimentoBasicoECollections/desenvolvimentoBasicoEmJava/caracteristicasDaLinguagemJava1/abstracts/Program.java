package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.abstracts;

public class Program {
    public static void main (String [] args){
        final ClassesAbstractsGeometricForm Square = new Square("Square",15.3);

        System.out.println(Square);
        System.out.println(Square.draw(12,60));
        System.out.println(Square.name());
        System.out.println(Square.area());


    }
}
