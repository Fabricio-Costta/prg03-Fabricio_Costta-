/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercioone;

/**
 *
 * @author fabri
 */
public class Fatura {
    //atributos
    private String numero;
    private String descricao;
    private int quantidadde;
    private double preco;
    
    //metedos
    public void faturaTest(){
        
    }
    
    //construtores
    public Fatura(String numero, String descricao, int quantidadde, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadde = quantidadde;
        this.preco = preco;
    }
    
    public void getTotalfatura(){
        this.preco;
    }
    //metedos especias

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

    public int getQuantidadde() {
        return quantidadde;
    }

    public void setQuantidadde(int quantidadde) {
        this.quantidadde = quantidadde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
}
