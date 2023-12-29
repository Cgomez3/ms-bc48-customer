package ms.bc48.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsBc48CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBc48CustomerApplication.class, args);
	}

}
