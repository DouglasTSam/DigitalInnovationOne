package one.innovation.digital.desenvolvimentoAvancado.aula6NovasFeaturesJava11;

public class StringIsBlankExemplo {
    public static void main(String[] args) {
        String espaco = "                          ";
        System.out.println(espaco == null || espaco.length() == 0 ||
                espaco.chars().allMatch(c -> c == ' '));

        System.out.println("\nMétodo novo do java 11 : " + espaco.isBlank());
    }
}
