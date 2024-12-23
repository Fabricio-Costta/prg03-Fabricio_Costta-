/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11heranca;

/**
 *
 * @author fabri
 */
public abstract class Pessoa {
    //atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //metedos
    public void fazerAniversario(){
        this.idade++;
    }
    
    //metedos especias

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome -> " + nome + ", idade -> " + idade + ", sexo -> " + sexo + '}';
    }

    
}
