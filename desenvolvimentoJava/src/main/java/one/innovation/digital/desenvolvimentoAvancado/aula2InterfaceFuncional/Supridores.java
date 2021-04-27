package one.innovation.digital.desenvolvimentoAvancado.aula2InterfaceFuncional;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
       // Supplier<Pessoa> suppliers = () -> new Pessoa();   OU
        Supplier<Pessoa> suppliers = Pessoa::new;
        System.out.println(suppliers.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Douglas";
        idade =  24;
    }

    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
