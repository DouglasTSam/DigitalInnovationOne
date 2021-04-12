package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.polimorfismo;

public class Executor {
    public static void main (String [] args){

        Carro carro = new Carro();
            carro.setMarca("*********************************\n"+"              CARRO        \n"
                    +"*********************************\n"+"Honda");
            carro.setModelo("Civic");
            carro.setValorVenal(1000.0);
            carro.setNumeroDePortas("4\n");


        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getNumeroDePortas());
        System.out.println(carro.setAcelerar());
        System.out.println(carro.setFreiar());
        System.out.println(carro.calcularImposto());

        Moto moto = new Moto();
            moto.setMarca("*********************************\n"+"               MOTO        \n"
                    +"*********************************\n"+"Suzuki");
            moto.setModelo("Yes");
            moto.setValorVenal(1000.0);
            moto.setCilindradas("150");


        System.out.println(moto.getMarca());
        System.out.println(moto.getModelo());
        System.out.println(moto.getCilindradas());
        System.out.println(moto.setAcelerar());
        System.out.println(moto.setFreiar());
        System.out.println(moto.calcularImposto());
    }
}
