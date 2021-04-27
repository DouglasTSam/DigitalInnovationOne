package one.innovation.digital.desenvolvimentoAvancado.aula1ParadigmasFuncionais.fatorialRecursivo;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemorization {
    static Map <Integer, Integer> MAPA_FATORIAL = new HashMap();
    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        long F = System.nanoTime();
        System.out.println("Fatorial 1 : " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        F = System.nanoTime();
        System.out.println("Fatorial 2 : " + (F-I));
    }

    //instaciado um mapa estático, toda vez que esse mapa estático passar um valor,
    // pega esse valor e se existir dentro do mapa retorna o mesmo
    //se não existir, faz o fatorial desse valor,vai devolver um resultado, vai por esse resultado no mapa estático,
    //e a chave dele será o valor do parâmetro. No final retorna o resultado

    public static Integer fatorialComMemorization(Integer value){
        if (value == 1){
            return value;
        }else{
            if(MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            }else{
                Integer resultado =  value * fatorialComMemorization(value-1);
                MAPA_FATORIAL.put(value,resultado);
                return resultado;
            }
        }
    }
}
