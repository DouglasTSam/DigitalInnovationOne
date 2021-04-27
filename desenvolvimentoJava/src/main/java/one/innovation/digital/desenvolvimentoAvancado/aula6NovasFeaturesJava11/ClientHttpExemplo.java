package one.innovation.digital.desenvolvimentoAvancado.aula6NovasFeaturesJava11;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class ClientHttpExemplo {
    public static void main(String[] args) throws IOException, InterruptedException {
        //connectAndPrintURLJavaOracle();
        connectAndPrintURLJavaOracleClientHttp();
    }
/// Método com URLConnection (verboso)
    private static void connectAndPrintURLJavaOracle()throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining())
                .replaceAll(">", ">\n"));
    }

//    Método com a nova ClienteHttpConnection

    public static void connectAndPrintURLJavaOracleClientHttp() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/")).build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code : " + response.statusCode());
        System.out.println("\nHeaders response : " + response.headers());
        System.out.println("\n*********************************** Body response : ***********************************\n");
        System.out.println(response.body());

    }
}
