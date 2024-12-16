package ma.emsi.serveur;

import jakarta.xml.ws.Endpoint;
import ma.emsi.service.EtudiantWService;

public class ServerWS {
    public static void main(String[] args) {
        String url="http://localhost:8085/";
        Endpoint.publish(url,new EtudiantWService());
        System.out.println(url);
    }
}