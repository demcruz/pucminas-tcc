package br.com.gsl.moduloInformacaoCadastral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GslModuloInformacaoCadastraisApplication {

	public static void main(String[] args) {
		SpringApplication.run(GslModuloInformacaoCadastraisApplication.class, args);
	}

}
