package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.finals;

public class Program {
    public static void main (String[] args){
        final HardcoreGamer hardCoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();
        
        final var game = "PUBG";

        //game = "LoL";

        System.out.println(casualGamer.play(game));
    }
}
