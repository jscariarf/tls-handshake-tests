package net.jibits;

import java.io.IOException;

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

public class HttpClient31 {

    public static void main(String[] args) {
    System.out.println("\nStarting Execution\n");
        org.apache.commons.httpclient.HttpClient client = new org.apache.commons.httpclient.HttpClient();
        String urlString = args[0];
        HttpMethod method = new GetMethod(urlString);
        
        try {
    int statusCode = client.executeMethod(method);
            System.out.println(method.getResponseBodyAsString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            method.releaseConnection();
        }
    }
}

