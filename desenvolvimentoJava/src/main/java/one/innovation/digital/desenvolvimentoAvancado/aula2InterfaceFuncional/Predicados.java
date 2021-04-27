package one.innovation.digital.desenvolvimentoAvancado.aula2InterfaceFuncional;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {

        //Predicate<String> estaVazio = valor -> valor.isEmpty();   OU
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Olá Mundo!!!"));
    }
}
