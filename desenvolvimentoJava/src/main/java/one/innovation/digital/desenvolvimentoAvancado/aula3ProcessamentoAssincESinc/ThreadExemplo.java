package one.innovation.digital.desenvolvimentoAvancado.aula3ProcessamentoAssincESinc;

public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF iniciarGerarPDF = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPDF);

        iniciarGerarPDF.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GeradorPDF extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Iniciando a geração do PDF");
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

//class BarraDeCarregamento extends Thread{
//    @Override
//    public void run(){
//        String ponto = "";
//        for(int i=0; i<5; i++){
//            ponto += ".";
//            try {
//                Thread.sleep(1000);
//                System.out.println("Loading " + ponto);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }
    @Override
    public void run(){
        while (true) {
            try {
                Thread.sleep(500);
                if (!iniciarGeradorPdf.isAlive()){
                    break;
                }
                
                System.out.println("Loading ...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}