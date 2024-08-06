package br.com.appMusic.principal;

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
    }
}
