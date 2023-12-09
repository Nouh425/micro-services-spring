package org.EMSI.ClientService;

import org.EMSI.ClientService.Model.Client;
import org.EMSI.ClientService.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
		return args -> {
		    clientRepository.save(new Client(Long.parseLong("3"), "nouh benchlikha", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("4"), "khalid abenay", Float.parseFloat("26")));


		};
	}

}
