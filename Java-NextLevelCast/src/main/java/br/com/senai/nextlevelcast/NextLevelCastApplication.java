package br.com.senai.nextlevelcast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.senai.nextlevelcast.principal.Principal;
import br.com.senai.nextlevelcast.repository.SerieRepository;

@SpringBootApplication
public class NextLevelCastApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(NextLevelCastApplication.class, 
				args);
	}

	
}
