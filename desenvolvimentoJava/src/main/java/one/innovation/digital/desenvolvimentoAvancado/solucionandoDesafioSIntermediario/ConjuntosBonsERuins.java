package one.innovation.digital.desenvolvimentoAvancado.solucionandoDesafioSIntermediario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConjuntosBonsERuins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer numero = Integer.parseInt(br.readLine());

        while(numero != 0) {
            List<String> conjuntos = new ArrayList<>();

            for (int i = 0; i < numero; i++) {
                conjuntos.add(br.readLine());
            }

            conjuntos = conjuntos.stream().sorted().collect(Collectors.toList());

            String resultado = "Conjunto Bom";

            for (int i = 0; i < numero - 1; i++) {
                if (conjuntos.get(i + 1).startsWith(conjuntos.get(i))) {
                    resultado = "Conjunto Ruim";
                }
            }

            System.out.println(resultado);
            numero = Integer.valueOf(br.readLine());
        }
    }
}
