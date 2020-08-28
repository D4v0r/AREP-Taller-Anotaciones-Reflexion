package co.edu.escuelaing.sparkd.microspring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MicroSpringBoot {



    public static void main(String[] args){
        args =new String[]{"co.edu.escuelaing.sparkd.microspring.HelloController"};
        try {
            MicroSpring microSpring= new MicroSpring();
            microSpring.start(args);
            int port = getPort();
            HttpServer server = new HttpServer(microSpring, port);
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }


}