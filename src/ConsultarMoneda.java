import com.google.gson.Gson;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public MonedaExchangeRateApi buscarMoneda(String moneda) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" +
                "80f9c1de39a6244d0a7045fc/latest/" + moneda);
        try {
        // se instancia el cliente que va ser requests
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        // con la libreria Gson se paso el response a un objeto  MonedaExchangeRateApi
        // para trabajar con esa estructura

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedaExchangeRateApi.class);


        } catch (ConnectException e){
            System.err.println("Verifique su conexion a intenert");

        } catch (SocketTimeoutException e){
            System.err.println("El servidor no responde tiempo de espera agotado");

        }
        catch (IOException | InterruptedException e) {
            System.err.println("Error por favor reinicie el programa ");

        }
        return null;
    }

}

