package com.mycompany.arepclase;
import static com.mycompany.arepclase.HttpServer.get;
import static com.mycompany.arepclase.HttpServer.post;

import java.io.IOException;
import java.net.URISyntaxException;

public class App {
    public static void main(String[] args) throws IOException, URISyntaxException {

        get("/hola", (req) -> {
            return "Hola Mundo " + req;
        });

        post("/recibido", (req) -> {
            return "No esta implementado el post" ;
        });
        // start the server
        if (!HttpServer.running) HttpServer.getInstance().start(args);
    }
}
