package one.innovation.digital.collections1.List.Vector;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //Adicionando 5 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de mesa");
        esportes.add("HandeBol");
        esportes.add("Vôlei");
        System.out.println(esportes);

        //Altera o valor da posição 2
        esportes.set(2, "Ping-Pong");
        System.out.println(esportes);

        //Remove o elemento na posição 2
        esportes.remove(2);
        System.out.println(esportes);

        //Remove o esporte "Handebol" do vetor
        esportes.remove("HandeBol");
        System.out.println(esportes);

        //Retorna o primeiro index do vetor
        System.out.println(esportes.get(0));

        //Navega entre o vetor
        for (String esporte:esportes) {
            System.out.println(esporte);
        }
    }
}
