package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Strings;

public class BuilderOfStrings {
    public static void main (String [] args) {
        var name = "Douglas";

        final var builder = new StringBuilder(name);
        System.out.println(builder.append("Carlos"));

        final var reverse = builder.reverse();
        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "!");
        System.out.println(insert);


    }
}
