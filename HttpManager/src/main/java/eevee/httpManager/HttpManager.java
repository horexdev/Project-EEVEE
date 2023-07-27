package eevee.httpManager;

import okhttp3.*;

import java.io.IOException;
import java.util.Objects;

public class HttpManager {
    public String get(String endpoint) {
        OkHttpClient client = new OkHttpClient();

        HttpUrl.Builder urlBuilder =
                Objects.requireNonNull(HttpUrl.parse("http://localhost:7500" + endpoint)).newBuilder();

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            assert response.body() != null;

            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
