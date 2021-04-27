package one.innovation.digital.desenvolvimentoAvancado.aula6NovasFeaturesJava11;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ClientHttp2Exemplo {
    static ExecutorService executor = Executors.newFixedThreadPool(4, new ThreadFactory() {

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            System.out.println("Nova Thread criada :: " + (thread.isDaemon() ? "Daemon" : "")+
                    " Thread Group :: " + thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws Exception {
        connectAkamaiHttp2Client();
    }

    private static void connectAkamaiHttp2Client() throws Exception {
        System.out.println("\nRunning HTTP/2 example .... \n");
        try{
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest =  HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code : " + response.statusCode());
            System.out.println("\nHeaders response : " + response.headers());
            System.out.println("\n*********************************** Body response : ***********************************\n");
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='")+5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"+image))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse = httpClient
                                        .send(imgRequest, HttpResponse.BodyHandlers.ofString());

                                System.out.println("Imagem carregada :: " + image+", status code :: "
                                        +imageResponse.statusCode());

                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de erro durante a requisição para recuperar a iamgem"+
                                        image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submetido um futuro para a imagem : " + image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                }catch (InterruptedException | ExecutionException e){
                    System.out.println("Erro ao esperar carregar imagem do futuro ");
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total :: " + ( end - start ) + " MS");
        }
        finally {
            executor.shutdown();
        }
    }
}

