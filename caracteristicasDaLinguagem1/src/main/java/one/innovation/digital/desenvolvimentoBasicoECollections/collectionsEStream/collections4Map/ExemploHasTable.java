package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections4Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHasTable {
    public static void main(String[] args) {


        Hashtable<String,Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos" , 21);
        estudantes.put("Mariana" , 33);
        estudantes.put("Rafaela" , 18);
        estudantes.put("Pedro" , 44);
        System.out.println("******************** Lista criaada ******************** \n");
        System.out.println(estudantes);

        estudantes.put("Pedro" , 55);
        System.out.println("***************** Adicionando outro Pedro *********************** \n");
        System.out.println(estudantes);

        //Remove um estudante no index 0
        estudantes.remove("Pedro");
        System.out.println("***************** Removendo o Pedro *********************** \n");
        System.out.println(estudantes);

        //Recupera um estudante no index 2
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println("***************** Recuperando idade de Mariana *********************** \n");
        System.out.println(estudantes);

        System.out.println("***************** Reimprimindo o mapa *********************** \n");
        System.out.println(estudantes.size());

        //Navega nos registros do mapa
        System.out.println("***************** Navegando com forEach e entrySet  *********************** \n");
        for (Map.Entry<String, Integer> entry:estudantes.entrySet() ){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("***************** Navegando com forEach e keySet  *********************** \n");
        for (String key: estudantes.keySet()) {
            System.out.println(key + " -- " + estudantes.get(key));
        }

        System.out.println("***************** Reimprimindo o mapa *********************** \n");
        System.out.println(estudantes);

    }
}
