package one.innovation.digital.desenvolvimentoAvancado.aula2InterfaceFuncional;

public class funcaoAltaOrdem {
    public static void main(String[] args) {
        Calcular soma = (a, b) ->a + b;
        Calcular subtracao = (a, b) ->a - b;
        Calcular divisao = (a, b) ->a / b;
        Calcular multiplicacao = (a, b) ->a * b;

        System.out.println("A soma dos valores é : " + executarOperacao(soma,10,5));
        System.out.println("A subtracao dos valores é : " + executarOperacao(subtracao,10,5));
        System.out.println("A divisão dos valores é : " + executarOperacao(divisao,10,5));
        System.out.println("A multiplicação dos valores é : " + executarOperacao(multiplicacao,10,5));

    }

    public static int executarOperacao(Calcular calculo,int a , int b){
        return calculo.calcular(a,b);
    }
}
@FunctionalInterface
interface Calcular{
    public int calcular(int a , int b);

}
