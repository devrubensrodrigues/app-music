package br.com.appMusic;

import br.com.appMusic.principal.Principal;
import br.com.appMusic.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMusic implements CommandLineRunner {
    @Autowired
    private ArtistaRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(AppMusic.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repository);
        principal.exibeMenu();
    }
}
