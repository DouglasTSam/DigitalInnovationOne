package one.innovation.digital.desenvolvimentoAvancado.aula6NovasFeaturesJava11;

import java.util.stream.Collectors;

public class StringLinesExemplo {
    public static void main(String[] args) {

        String html = "<html>\n <header>\n </header>\n <body>\n </body>\n</html>";
        System.out.println(html + "\n\n\n");

        System.out.println("TAG HEADER :: " + html.lines().filter(s -> s.contains("head"))
                .collect(Collectors.joining()));

        System.out.println(html.lines().map(s -> "\n[TAG] :: " + s).collect(Collectors.joining()));
    }
}
