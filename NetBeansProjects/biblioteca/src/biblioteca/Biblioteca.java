/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fabri
 */
public class Biblioteca {
     private List<Livro> livrosDisponiveis; // Lista de livros
    private Map<Usuario, List<Livro>> emprestimos; // Mapa de empréstimos

    public Biblioteca() {
        livrosDisponiveis = new ArrayList<>();
        emprestimos = new HashMap<>();
    }

    // Adiciona um livro à lista de livros disponíveis
    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    // Mostra os livros disponíveis na biblioteca
    public void exibirLivrosDisponiveis() {
        System.out.println("\n--- Livros Disponíveis ---");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }
    }

    // Empresta um livro a um usuário
    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livrosDisponiveis.contains(livro)) {
            livrosDisponiveis.remove(livro); // Remove da lista de disponíveis
            emprestimos.putIfAbsent(usuario, new ArrayList<>()); // Garante que o usuário tenha uma lista no mapa
            emprestimos.get(usuario).add(livro); // Adiciona o livro à lista do usuário
            System.out.println("Livro emprestado: " + livro + " para " + usuario);
        } else {
            System.out.println("Livro não disponível: " + livro.getTitulo());
        }
    }

    // Exibe os empréstimos de um usuário
    public void exibirEmprestimos(Usuario usuario) {
        System.out.println("\n--- Livros Emprestados por " + usuario.getNome() + " ---");
        List<Livro> livros = emprestimos.getOrDefault(usuario, new ArrayList<>());
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
