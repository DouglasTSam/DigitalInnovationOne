package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.interfaces;

public class Fiesta implements Car,Vehicle{

    @Override
    public String brand(){
        return "Ford";
    }
    @Override
    public String register(){
        return "938AVSDKN3922";
    }
    @Override
    public void start(){
        Car.super.start();

        Vehicle.super.start();
    }
}
