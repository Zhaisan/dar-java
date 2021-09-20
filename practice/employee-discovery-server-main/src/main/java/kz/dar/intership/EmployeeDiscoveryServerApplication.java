package kz.dar.intership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EmployeeDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDiscoveryServerApplication.class, args);
	}

}
