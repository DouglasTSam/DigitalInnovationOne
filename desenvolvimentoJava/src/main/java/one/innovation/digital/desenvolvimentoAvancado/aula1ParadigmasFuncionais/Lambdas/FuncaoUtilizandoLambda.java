package one.innovation.digital.desenvolvimentoAvancado.aula1ParadigmasFuncionais.Lambdas;

public class FuncaoUtilizandoLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSrNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSrNaString.gerar("João"));
    }

    @FunctionalInterface
    interface Funcao{
        String gerar (String nome);
    }
}
