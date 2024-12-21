/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author fabri
 */
public class Main {
    public static void main(String[] args) {
        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "12345");
        Livro livro2 = new Livro("1984", "George Orwell", "67890");
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", "11223");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Exibindo livros disponíveis
        biblioteca.exibirLivrosDisponiveis();

        // Criando usuários
        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");

        // Emprestando livros
        biblioteca.emprestarLivro(usuario1, livro1);
        biblioteca.emprestarLivro(usuario2, livro3);

        // Tentando emprestar um livro já emprestado
        biblioteca.emprestarLivro(usuario1, livro3);

        // Exibindo livros disponíveis após empréstimos
        biblioteca.exibirLivrosDisponiveis();

        // Exibindo os empréstimos dos usuários
        biblioteca.exibirEmprestimos(usuario1);
        biblioteca.exibirEmprestimos(usuario2);
    }
}
