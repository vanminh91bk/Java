package vn.isofh.hl7;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class App {
  public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

  OkHttpClient client = new OkHttpClient();

  String post(String url, String json) throws IOException {
    RequestBody body = RequestBody.create(JSON, json);
    Request request = new Request.Builder()
        .url(url)
        .post(body)
        .build();
    
    Response response = client.newCall(request).execute();
    
    return response.body().string();
  }

  public static void main(String[] args) throws IOException {
	  System.out.println(HL7Convert.getOMI_O23());
  }
}