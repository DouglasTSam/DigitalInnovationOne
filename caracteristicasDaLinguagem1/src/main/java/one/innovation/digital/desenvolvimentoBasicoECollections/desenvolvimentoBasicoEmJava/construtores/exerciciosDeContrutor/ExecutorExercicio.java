package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.construtores.exerciciosDeContrutor;

public class ExecutorExercicio {
    public static void main (String [] args ){

        ContrutorCarro carro = new ContrutorCarro("Ford", "NewFiesta", "2017");
        carro.setVariante("Laranja");


        System.out.println("Nós temos esse modelo " + carro.getModelo()+","+
                "\nda fabricante "+ carro.getMarca()+","+
                "\nfabricado no ano de "+carro.getAno()+","+
                "\ne ainda tem a cor "+carro.getVariante()+" WWWooooOWW!");

    }
}
