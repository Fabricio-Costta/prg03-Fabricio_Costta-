/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11heranca;

/**
 *
 * @author fabri
 */
public class Aluno extends Pessoa{
    //atributos
    private int matricula;
    private String curso;
    
    //metedos
    public void pagamatricula(){
        System.out.println(" Paga matricula do aluno -> " + this.nome );
    }
    
    //metedos especias

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
