package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections4Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String,String> treeCapitais = new TreeMap<>();

        //Monta uma árvore com as capitaos
        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de janeiro");
        treeCapitais.put("MG","Belo Horizonte");
        System.out.println("**************** Lista criada *******************");
        System.out.println(treeCapitais);
        System.out.println("***********************************");

        //Retorna a primeira capital no topo da árvore
        System.out.println("\nPrimeira capital : " + treeCapitais.firstKey());
        System.out.println("***********************************");

        //Retorna a última capital no final da árvore
        System.out.println("Última capital : " + treeCapitais.lastKey());
        System.out.println("***********************************");

        //Retorna a primeira capital abaixo da árvore da capital parametrizada
        System.out.println("Abaixo <- da capital SC : " + treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital acima da árvore da capital parametrizada
        System.out.println("Acima -> da capital SC : " + treeCapitais.higherKey("SC"));

        System.out.println("\n************* Reimpressão do TreeMap **************\n");
        System.out.println(treeCapitais);
        System.out.println("***********************************");

        //Retorna a primeira capital no topo da árvore
        System.out.println("\nPrimeira capital no topo da árvore : ");
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //Retorna a ultima capital no final da árvore
        System.out.println("\nÚltima capital no final da árvore : ");
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println("\nPrimeira abaixo <- da capital 'SC' : ");
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println("\nPrimeira acima -> da capital 'SC' : ");
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue());

        //Reimprimindo a lista
        System.out.println("\n************** Reimprimindo a lista ****************** \n");
        System.out.println(treeCapitais + "\n");
        System.out.println("***********************************");

        //Retorna a primeira capital no topo da árvore, removendo do mapa
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

        //Retorna a primeira capital no final da árvore, removendo do mapa
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        //Reimprimindo a lista
        System.out.println("\n************** Reimprimindo a lista sem os elementos que eram primeiro e último ******************");
        System.out.println(treeCapitais + "\n");

        //Navegando no mapa através de um iterator
        System.out.println("\n************** Navegando através de iterator ****************** \n");
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        //Navegando no mapa através de forEach com keySet
        System.out.println("\n************** Navegando através do forEach e keySet ****************** \n");
        for (String capital : treeCapitais.keySet()) {
            System.out.println(capital + " -- " + treeCapitais.get(capital));
        }

        //Navegando no mapa através de forEach com entrySet
        System.out.println("\n************** Navegando através do forEach e entrySet ****************** \n");
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }

    }
}
