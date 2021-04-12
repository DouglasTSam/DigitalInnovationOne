package one.innovation.digital.desenvolvimentoAvancado.paradigmasFuncionais.fatorialRecursivo;

public class FatorialRecursivo {
    public static void main(String[] args) {

        System.out.println(fatorial(5));

    }

    public static int fatorial (int numero ){
        if(numero == 1){
            return numero;
        }else{
            return numero * fatorial(numero-1);
        }
    }
}
