package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.interfaces;

public interface Car extends Auto{

    String brand();

    default void start() {
        System.out.println("Starting the car !!");
    }
}
