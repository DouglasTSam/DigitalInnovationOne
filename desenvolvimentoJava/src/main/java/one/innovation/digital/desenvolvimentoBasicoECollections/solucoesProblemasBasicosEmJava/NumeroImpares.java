package one.innovation.digital.desenvolvimentoBasicoECollections.solucoesProblemasBasicosEmJava;

import java.util.Scanner;

public class NumeroImpares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i = i + 2 ) { //complete seu codigo aqui
            System.out.println(i);
        }
    }

}
