package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.interfaces;

public interface Vehicle {

    String register();
    
    default void start(){
        System.out.println("Starting the vehicle !");
    }

    //void turnOff();

    /*
    default void turnOff(){
        System.out.println("Turning off the vehicle !");
     */
}
