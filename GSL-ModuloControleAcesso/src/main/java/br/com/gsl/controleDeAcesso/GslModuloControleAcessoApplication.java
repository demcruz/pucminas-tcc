package br.com.gsl.controleDeAcesso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GslModuloControleAcessoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GslModuloControleAcessoApplication.class, args);
	}

}
