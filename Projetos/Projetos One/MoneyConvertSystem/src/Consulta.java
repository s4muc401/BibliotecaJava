import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Consulta {
    public String Consultando(String moeda1, String moeda2) throws IOException {
        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/6b52f4ed119571a0b4a290b6/pair/" + moeda1 + "/" + moeda2 ;

        // Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Accessing object
        String req_result = jsonobj.get("conversion_rate").getAsString();
        return req_result;
    }
}
