package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections3Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Adicionando capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        System.out.println(treeCapitais);

        System.out.println("______________________________________");
        System.out.println("Retorna a primeira capital na posição 0 : " + treeCapitais.first());

        System.out.println("______________________________________");
        System.out.println("Retorna a última capital na lista : " + treeCapitais.last());

        System.out.println("______________________________________");
        System.out.println("Retorna a primeira capital abaixo da arvore da capital parametrizada : " +
                treeCapitais.lower("Rio de Janeiro"));

        System.out.println("______________________________________");
        System.out.println("Retorna a primeira capital acima da arvore da capital parametrizada : " +
                treeCapitais.higher("Rio de Janeiro"));

        System.out.println("______________________________________");
        System.out.println("Exibindo todas as capitais : " + treeCapitais);

        System.out.println("______________________________________");
        System.out.println("Retorna a primeira capital removendo da arvore : " + treeCapitais.pollFirst());

        System.out.println("______________________________________");
        System.out.println("Retorna a última capital removendo da arvore : " + treeCapitais.pollLast());

        System.out.println("______________________________________");
        System.out.println(treeCapitais);

        System.out.println("______________________________________");
        Iterator<String>iterator = treeCapitais.iterator();
        while(iterator.hasNext()){
            System.out.println("Cidade no iterator : " + iterator.next());
        }

        System.out.println("______________________________________");
        for (String cidade : treeCapitais) {
            System.out.println("Cidade no forEach : " + cidade);
        }
    }
}
