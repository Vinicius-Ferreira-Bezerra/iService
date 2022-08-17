package iservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.iservice.controller")
public class IServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IServiceApplication.class, args);
	}

}
