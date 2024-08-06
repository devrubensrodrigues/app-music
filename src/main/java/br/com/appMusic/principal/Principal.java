package br.com.appMusic.principal;

import br.com.appMusic.model.enums.TipoArtista;

import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);

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

        while(opcao != 9) {
            switch (opcao) {
                case 1:
                    cadastrasArtista();
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
                default:
                    System.out.println("Número informado é inválido!!");
            }

        }
        System.out.println("Saindo...");
    }

    private void pesquisarDadosSobreUmArtista() {

    }

    private void buscarMusicasPorArtista() {

    }

    private void listarMusicas() {

    }

    private void cadastrarMusicas() {

    }

    private void cadastrasArtista() {
        String opcaoEscolhida = "s";

        while(opcaoEscolhida.equals("s")) {
            System.out.print("Qual o nome do artista? ");
            String nomeArtista = sc.nextLine();
            System.out.print("Informe o tipo do artista(SOLO/DUPLA/BANDA): ");
            TipoArtista tipo = TipoArtista.valueOf(sc.nextLine().toUpperCase());
            System.out.print("Cadastrar outro artista?(s/n): ");
            opcaoEscolhida = sc.nextLine();
        }
    }
}
