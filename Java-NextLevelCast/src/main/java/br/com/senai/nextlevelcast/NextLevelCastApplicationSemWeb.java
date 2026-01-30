//package br.com.senai.nextlevelcast;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import br.com.senai.nextlevelcast.principal.Principal;
//import br.com.senai.nextlevelcast.repository.SerieRepository;

//@SpringBootApplication
//public class NextLevelCastApplicationSemWeb implements CommandLineRunner {
//	@Autowired
//	private SerieRepository repositorio;
//
//	public static void main(String[] args) {
//		SpringApplication.run(NextLevelCastApplicationSemWeb.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(repositorio);
//		principal.exibeMenu();
//	}
//}
