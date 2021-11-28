package kz.java.dar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PostDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostDiscoveryServerApplication.class, args);
    }

}
