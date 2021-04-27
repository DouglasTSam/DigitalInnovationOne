package one.innovation.digital.desenvolvimentoAvancado.aula1ParadigmasFuncionais.fatorialRecursivo;

public class FatorialTailCall {
    //O java não suporta esse método com números grandes igual ou acima de 100 mil
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    public static double fatorialA (double valor){
        return fatorialComTailCall(valor, 1);
    }

    public static double fatorialComTailCall(double valor, double numero){
        if(valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor -1, numero * valor);
    }
}
