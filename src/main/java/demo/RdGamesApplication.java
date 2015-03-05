package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RdGamesApplication {

    public static void main(String[] args) {
        String webPort = System.getenv("PORT");
        if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
        System.setProperty("server.port", webPort);
        SpringApplication.run(RdGamesApplication.class, args);
    }
}
