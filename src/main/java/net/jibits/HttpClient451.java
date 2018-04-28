package net.jibits;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


class HttpClient451
{
  public static void main(String args[]) throws Exception
  {
    System.out.println("\nStarting Execution\n");
    String urlString = args[0];
    HttpGet httpGet = new HttpGet(urlString);
    CloseableHttpClient httpClient = HttpClients.createDefault();
    try {
      CloseableHttpResponse response = httpClient.execute(httpGet);
      try {
        System.out.println(response.getStatusLine());
      } finally {
        response.close();
      }
    } finally {
      httpClient.close();
    }
  }
}
