package one.innovation.digital.desenvolvimentoAvancado.aula3ProcessamentoAssincESinc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

//public class FutureExemplo {
//    private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);
//
//    public static void main(String[] args) {
//        Casa casa =  new Casa(new Quarto());
//        casa.obterAFazeresDaCasa().forEach(atividade -> threadPool.execute(() -> atividade.realizar()));
//        threadPool.shutdown();
//    }
//}
//
//class Casa  {
//    private List<Comodo> comodos;
//
//    Casa(Comodo... comodos){
//        this.comodos = Arrays.asList(comodos);
//    }
//
//    List<Atividade> obterAFazeresDaCasa(){
//        return this.comodos.stream().map(Comodo::obterAFazeresDoComodo)
//                    .reduce(new ArrayList<Atividade>(),(pivo, atividades) ->{
//                        pivo.addAll(atividades);
//                        return pivo;
//                    });
//    }
//}
//
//interface Atividade{
//    void realizar() throws InterruptedException;
//}
//
//abstract class Comodo{
//    abstract  List<Atividade> obterAFazeresDoComodo();
//}
//
//class Quarto extends Comodo{
//    @Override
//    List<Atividade> obterAFazeresDoComodo(){
//        return Arrays.asList(
//                this::getArrumarACama,
//                this::varrerOQuarto,
//                this::arrumarGuardaRoupa
//        );
//    }
//
//    private void arrumarGuardaRoupa(){
//        System.out.println("Arrumar o guarda roupa");
//    }
//
//    private void varrerOQuarto(){
//        System.out.println("Varrer o quato");
//    }
//
//    private void getArrumarACama(){
//        System.out.println("Arrumar a cama");
//    }
//}


////////// FUTURE EXEMPLO COM FUTURE


public class FutureExemplo {

    private static final ExecutorService pessoaExecutandoAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<Future<String>>futuros =
                new CopyOnWriteArrayList<>(casa.obterAFazeresDaCasa().stream()
                        .map(atividade -> pessoaExecutandoAtividade.submit(()->{
                                    try{
                                        return atividade.realizar();
                                    }catch (InterruptedException e){
                                        e.printStackTrace();
                                    }
                                    return null;
                                }))
                        .collect(Collectors.toList()));

        while(true){
            int numeroDeAtividadeNaoProntas = 0;
            for(Future<?> futuro : futuros) {
                if (futuro.isDone()) {
                    try {
                        System.out.println("Parabéns você terminou de : " + futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    numeroDeAtividadeNaoProntas++;
                }
            }
            if (futuros.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Número de atividade não finalizada :: " + numeroDeAtividadeNaoProntas);
            Thread.sleep(700);
        }
        pessoaExecutandoAtividade.shutdown();
    }
}

class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAFazeresDaCasa() {
        return this.comodos.stream().map(Comodo::aFazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

interface Atividade {
    String realizar() throws InterruptedException;
}

abstract class Comodo {
    abstract List<Atividade> aFazeresDoComodo();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> aFazeresDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(3000);
        String arrumarRoupa = "Arrumar o guarda roupa";
        System.out.println(arrumarRoupa);
        return arrumarRoupa;
    }

    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(5000);
        String varrerQuarto = "Varrer o quato";
        System.out.println(varrerQuarto);
        return varrerQuarto;
    }

    private String arrumarACama()  throws InterruptedException {
        Thread.sleep(7000);
        String arrumarCama = "Arrumar a cama";
        System.out.println(arrumarCama);
        return arrumarCama;
    }
}