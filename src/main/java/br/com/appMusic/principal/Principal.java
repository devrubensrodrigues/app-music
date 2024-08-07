package br.com.appMusic.principal;

import br.com.appMusic.model.Artista;
import br.com.appMusic.model.enums.TipoArtista;
import br.com.appMusic.repository.ArtistaRepository;

import java.util.Scanner;

public class Principal {
    private final ArtistaRepository repository;
    private Scanner sc = new Scanner(System.in);

    public Principal(ArtistaRepository repository) {
        this.repository = repository;
    }

    public void exibeMenu() {
        System.out.println("""
                1- Cadastrar artista
                2- Cadastrar músicas
                3- Listar músicas
                4- Buscar músicas por artista
                5- Pesquisar dados sobre um artista
                
                9- Sair
                """);

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                cadastrarArtista();
                break;
            case 2:
                cadastrarMusicas();
                break;
            case 3:
                listarMusicas();
                break;
            case 4:
                buscarMusicasPorArtista();
                break;
            case 5:
                pesquisarDadosSobreUmArtista();
                break;
            case 9:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Número informado é inválido!!");
        }
    }

    private void pesquisarDadosSobreUmArtista() {

    }

    private void buscarMusicasPorArtista() {

    }

    private void listarMusicas() {

    }

    private void cadastrarMusicas() {

    }

    private void cadastrarArtista() {
        var opcaoEscolhida = "S";

        while (opcaoEscolhida.equalsIgnoreCase("s")) {
            System.out.print("Qual o nome do artista? ");
            var nomeArtista = sc.nextLine();
            System.out.print("Informe o tipo do artista(SOLO/DUPLA/BANDA): ");
            var tipo = TipoArtista.valueOf(sc.nextLine().toUpperCase());
            //Artista artista = new Artista(nomeArtista, tipo);
            //repository.save(artista);
            System.out.print("Cadastrar outro artista?(S/N): ");
            opcaoEscolhida = sc.nextLine();
        }
        exibeMenu();
    }
}
