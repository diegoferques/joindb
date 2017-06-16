package com.diego.ibge.join;

import com.diego.ibge.join.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JoinApplication implements CommandLineRunner {

	@Autowired
	JoinService joinService;

	@Autowired
	RestTemplate restTemplate;

	//Manual CommandLineRunner abaixo:
	//https://www.mkyong.com/spring-boot/spring-boot-non-web-application-example/
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(JoinApplication.class);
		//SpringApplication.run(JoinApplication.class, args);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	//access command line arguments
	@Override
	public void run(String... args) throws Exception {
		joinService.iniciar();

		/*
		//https://stackoverflow.com/a/21920398
		String urlToken = "https://alfa.sigcportalagro.ibge.gov.br/integracao/getacesstokenasync?clientId=sigc-api&clientSecret=secret-api";
		String urlCadastro = "https://alfa2.sigc.ibge.gov.br/integracao/CadastrarUsuario";

		ResponseEntity<String> token = restTemplate.exchange(urlToken, HttpMethod.GET, null, String.class);

		//VERIFICAR SE O TOKEN VAI SER ESTÁTICO OU DINÂMICO
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + token.getBody());

		Join join = new Join();

		HttpEntity<Join> requestCadastro = new HttpEntity<>(join, headers);

		ResponseEntity<ResponseCadastro> responseCadastro = restTemplate.exchange(
				urlCadastro, HttpMethod.POST, requestCadastro, ResponseCadastro.class);


		//ADICIONAR EXCEPTION NO JAVA
		//https://stackoverflow.com/questions/6340918/trust-store-vs-key-store-creating-with-keytool/41280603#41280603
		//keytool -importcert -alias certificado-IBGE -file C:\xampp\htdocs\spring\alfa.sigcportalagro.cer -keystore truststore
		*/

	}


}
