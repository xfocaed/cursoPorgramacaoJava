package Biblioteca;

import java.util.Scanner;

public class BibliotecaUI {

    public static void main(String[] args) {

        Biblioteca bb = new Biblioteca();

        System.out.println("SISTEMA DE BIBLIOTECA");
        System.out.println("Opções");
        System.out.println("1.   Inserir Livro");
        System.out.println("2.   Buscar Livro");
        System.out.println("3.   Remover Livro");
        System.out.println("4.   Listar Livros");
        System.out.println("5.   Sair");

        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();
        leitor.nextLine();
       
        while (opcao != 5) {
            switch (opcao) {
            case 1:
                System.out.println("Entre com o nome do autor :");
                String autor = leitor.nextLine();

                System.out.println("Entre com o titulo :");
                String titulo = leitor.nextLine();

                System.out.println("Entre com a data de publicação:");
                String publicacao = leitor.nextLine();

                System.out.println("Entre com o código do Livro:");
                String codigo = leitor.next();

                Livro l = new Livro(autor, titulo, publicacao, codigo);
                boolean adicionado = bb.adicionarLivro(l);
                if (adicionado) {
                    System.out.println("Livro adicionado com sucesso!");
                } else {
                    System.out.println("Nao foi possivel adicionar o livro!");
                }
                break;
            case 2:
                System.out.println("Buscando Livro...");
                System.out.println("Entre com o código do Livro:");
                String code1 = leitor.next();
                Livro encontrado = bb.buscarLivro(code1);

                if (encontrado == null) {
                    System.out.println("Livro não encontrado!");
                } else {
                    System.out.println(encontrado.codigo + " "
                            + encontrado.titulo + " " + encontrado.autor);
                }

                break;
            case 3:
                System.out.println("Removendo Livro...");
                System.out.println("Entre com o código do Livro:");
                String code2 = leitor.next();
                boolean removido = bb.removerLivro(code2);

                if (removido) {
                    System.out.println("Livro removido com sucesso!");
                } else {
                    System.out.println("Livro não encontrado");
                }

                break;

            case 4:
                bb.listarAcervo();
                break;

            default:
                System.out.println("Opção invalida!");
            }
           
            opcao = leitor.nextInt();
            leitor.nextLine();
        }
    }
}