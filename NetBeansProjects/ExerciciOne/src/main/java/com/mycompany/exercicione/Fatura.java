/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicione;
/**
 * 1. (Deitel Java 3.13) Crie uma classe em Java chamada fatura para uma loja de
suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a
descrição (String), a quantidade comprada de um item (int) e o preço por item
(double). A classe deve ter um construtor e um método get e set para cada variável de
instância. Além disso, forneça um método chamado getTotalFatura que calcula o valor
da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser
configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0.
Escreva um aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra
as capacidades da classe Fatura. 

 */

/**
 *
 * @author fabri
 */
public class Fatura {
    public class Fatura {
    // Variáveis de instância
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;
    
    // Construtor
    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.setQuantidade(quantidade);
        this.setPrecoPorItem(precoPorItem);
    }

    // Métodos get e set
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        // Se a quantidade for negativa, define como 0
        this.quantidade = quantidade > 0 ? quantidade : 0;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        // Se o preço por item for negativo, define como 0.0
        this.precoPorItem = precoPorItem > 0 ? precoPorItem : 0.0;
    }

    // Método que calcula o valor total da fatura
    public double getTotalFatura() {
        return quantidade * precoPorItem;
    }
}

}
