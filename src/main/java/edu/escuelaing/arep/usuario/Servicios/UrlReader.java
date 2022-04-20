package edu.escuelaing.arep.usuario.Servicios;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlReader {
    static String respu = "";
    public static String postServicio (String usuario, String comentario) throws IOException {
        String site = "http://localhost:34000/postT?"+"user="+usuario+"&body="+comentario;
        URL url = new URL(site);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setDoOutput(true);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return response.toString();
        }
    }

    public static String getService () throws IOException {
        String site = "http://localhost:7654/Feed";
        URL url = new URL(site);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setDoOutput(true);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return response.toString();
        }
    }
}
