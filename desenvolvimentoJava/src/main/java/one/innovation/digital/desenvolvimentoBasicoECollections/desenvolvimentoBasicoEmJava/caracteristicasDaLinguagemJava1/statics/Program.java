package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.statics;

public class Program {
    public static void main (String [] args){
        final Dog pitbull = new Dog();
       // pitbull.zoology = "biped";

        final Dog mutt = new Dog();

        System.out.println(pitbull.zoology);
        System.out.println(mutt.zoology);

        System.out.println(Dog.barks());
    }
}
