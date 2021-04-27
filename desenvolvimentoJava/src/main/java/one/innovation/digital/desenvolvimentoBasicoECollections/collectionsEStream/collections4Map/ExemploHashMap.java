package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections4Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String,Integer>tacasMundiais = new HashMap<>();

        //Adicionando os títulos às seleções
        tacasMundiais.put("Brasil", 5);
        tacasMundiais.put("Alemanhã", 4);
        tacasMundiais.put("Itália", 4);
        tacasMundiais.put("Uruguai", 2);
        tacasMundiais.put("Argentina", 2);
        tacasMundiais.put("França", 2);
        tacasMundiais.put("Inglaterra", 1);
        tacasMundiais.put("Espanha", 1);
        System.out.println("************* Lista criada : *************\n");
        System.out.println(tacasMundiais);

        //Atualiza o valor para a chave Brasil
        tacasMundiais.put("Brasil",6);
        System.out.println("\n************* Modificando o valor da chave Brasil : *************\n");
        System.out.println(tacasMundiais);

        //Retorna Argentina como parâmetro
        System.out.println("\nRetorna o valor da chave Argentina : " + tacasMundiais.get("Argentina"));

        //Retorna se existe um campeão com o nome França
        System.out.println("Retorna se existe França no mapa : " + tacasMundiais.containsKey("França"));

        //Remove o campeão França
        System.out.println("Removendo a França do mapa : ");
        tacasMundiais.remove("França");

        //Retorna se existe um campeão com o nome França
        System.out.println("Retorna se existe França no mapa : " + tacasMundiais.containsKey("França"));

        //Retorna se existe algum campeão com 6 títulos
        System.out.println("Retorna se existe algum hexaCampeão : " + tacasMundiais.containsValue(6));

        //Retorna o tamanho da lista
        System.out.println("Retorna o tamanho do mapa : " + tacasMundiais.size());

        //Retorna toda a lista
        System.out.println("\n************* Iprimindo toda a lista novamente *************\n");
        System.out.println(tacasMundiais);

        //Mapeando nos registros do mapa com Map.Entry
        System.out.println("\n********* Dentro do for com o entrySet **********\n");
        for (Map.Entry<String,Integer> entry : tacasMundiais.entrySet()) {
            System.out.println(entry.getKey() + " ---- " + entry.getValue());
        }
        System.out.println("\n********* Dentro do for com o keySet **********\n");
        //Mapeando nos registro do mapa com keySet
        for (String key : tacasMundiais.keySet()) {
            System.out.println(key + " --- " + tacasMundiais.get(key));
        }
        System.out.println("\n********* Iprimindo toda a lista novamente **********\n");
        System.out.println(tacasMundiais);

        //Verifica se o mapa contém a chave Estados Unidos
        System.out.println("\nVerificando se existe a key Estados Unidos no mapa : " + tacasMundiais.containsKey("Estados Unidos"));

        //Verifica se o mapa contém  o valor 5
        System.out.println("Verificando se existe o valor 5 no mapa : " + tacasMundiais.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println("Retornando o tamanho do mapa : " + tacasMundiais.size());
        System.out.println("Limpando o mapa");
        tacasMundiais.clear();
        System.out.println("Retornando o tamanho do mapa : " + tacasMundiais.size());
    }
}
