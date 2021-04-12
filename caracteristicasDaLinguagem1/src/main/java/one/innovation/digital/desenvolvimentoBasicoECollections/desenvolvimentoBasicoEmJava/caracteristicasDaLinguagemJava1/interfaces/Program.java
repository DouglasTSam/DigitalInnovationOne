package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.interfaces;

public class Program {
    public static void main (String [] args){
        final Gol gol = new Gol();
        System.out.println("Brand of Gol : "+gol.brand());
        gol.start();

        final Tractor tractor = new Tractor();
        System.out.println("Register of Tractor : "+tractor.register());
        tractor.start();

        final Fiesta fiesta = new Fiesta();
        System.out.println("Register of Fiesta : "+fiesta.brand());
        System.out.println("Register of Fiesta : "+fiesta.register());
        fiesta.start();
    }
}
