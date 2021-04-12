package one.innovation.digital.desenvolvimentoBasicoECollections.collectionsEStream.collections4Map.exercicio;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {

        LinkedHashMap<String, String> estadosBrasil = new LinkedHashMap<>();

        estadosBrasil.put("AC","Acre");
        estadosBrasil.put("AL","Alagoas");
        estadosBrasil.put("AP","Amapá");
        estadosBrasil.put("AM","Amazonas");
        estadosBrasil.put("BA","Bahia" );
        estadosBrasil.put("CE","Ceará");
        estadosBrasil.put("ES","Espírito Santo");
        estadosBrasil.put("GO","Goiás");
        estadosBrasil.put("MA","Maranhão");
        estadosBrasil.put("MT","Mato Grosso" );
        estadosBrasil.put("MS","Mato Grosso do Sul");
        estadosBrasil.put("MG","Minas Gerais");
        estadosBrasil.put("PA","Pará");
        estadosBrasil.put("PB","Paraíba");
        estadosBrasil.put("PR","Paraná");
        estadosBrasil.put("PE","Pernambuco");
        estadosBrasil.put("PI","Piauí");
        estadosBrasil.put("RJ","Rio de Janeiro");
        estadosBrasil.put("RN","Rio Grande do Norte");
        estadosBrasil.put("RS","Rio Grande do Sul");
        estadosBrasil.put("RO","Rondônia");
        estadosBrasil.put("RR","Roraima" );
        estadosBrasil.put("SC","Santa Catarina");
        estadosBrasil.put("SP","São Paulo");
        estadosBrasil.put("SE","Sergipe" );
        estadosBrasil.put("TO","Tocantins" );
        System.out.println("*********************** Imprimindo o mapa criado ******************************");
        System.out.println(estadosBrasil);

        System.out.println("*********************** Removendo o estado Minas Gerais ******************************\n");
        estadosBrasil.remove("MG");
        System.out.println(estadosBrasil);

        System.out.println("*********************** Adicionando Distrito Federal ******************************\n");
        estadosBrasil.put("DF","Distrito Federal");
        System.out.println(estadosBrasil);

        System.out.println("********************** Tamanho do mapa ******************************\n");
        System.out.println(estadosBrasil.size());

        System.out.println("************* Removendo o estado Mato Grosso do Sul pelo nome *************\n");
        estadosBrasil.remove("Mato Grosso do Sul");
        System.out.println(estadosBrasil);

        System.out.println("************* Navegando pelo mapa e mostrando estado(Sigla) *************\n");
        for (Map.Entry<String, String > mapa : estadosBrasil.entrySet()) {
            System.out.println(mapa.getValue() + " ( " + mapa.getKey()+ " )");
        }

        System.out.println("************* Verificando se existe no mapa um estado com a sigla SC *************\n");
        System.out.println(estadosBrasil.containsKey("SC"));

        System.out.println("************* Verificando se existe no mapa um estado com o nome Mato Grosso *************\n");
        System.out.println(estadosBrasil.containsValue("Mato Grosso"));


    }
}
