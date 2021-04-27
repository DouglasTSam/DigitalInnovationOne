package one.innovation.digital.desenvolvimentoAvancado.aula3ProcessamentoAssincESinc;

public class ThreadExemploCarregamento {
    //    Usando "extends Thread"
//    public static void main(String[] args) {
//        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
//        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();
//
//        barraDeCarregamento3.start();
//        barraDeCarregamento2.start();
//
//    }

    //Usando "implements Runnable"

    public static void main(String[] args) {
        Thread thread = new Thread(new BarraDeCarregamento2());
        Thread thread2 = new Thread(new BarraDeCarregamento3());

        thread.start();
        thread2.start();
        System.out.println("Nome da Thread : "+ thread.getName());
        System.out.println("Nome da Thread : "+ thread2.getName());
    }
}

//class BarraDeCarregamento2 extends Thread{
//    @Override
//    public void run(){
//    super.run();
//
//        try {
//            Thread.sleep(1000);
//            System.out.println("rodei BarraDeCarregamento2 " +    this.getName());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class BarraDeCarregamento3 extends Thread{
//    @Override
//    public void run(){
//        super.run();
//
//        try {
//            Thread.sleep(4000);
//            System.out.println("rodei BarraDeCarregamento3 " +    this.getName());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}

class BarraDeCarregamento2 implements Runnable{
    @Override
    public void run(){

        try {
            Thread.sleep(1000);
            System.out.println("rodei BarraDeCarregamento2 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 implements Runnable{
    @Override
    public void run(){

        try {
            Thread.sleep(4000);
            System.out.println("rodei BarraDeCarregamento3 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
