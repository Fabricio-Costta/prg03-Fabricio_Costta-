/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11heranca;

/**
 *
 * @author fabri
 */
public class Bolsista extends Aluno{
    //atributo
    private int bolsa;
    
    //metedos
    
    public void renevarBolsar(){
        System.out.println(" Renova bolsa do aluno " + this.nome); 
    }

    @Override
    public void pagamatricula(){
        System.out.println(this.nome + " bolsa totamente paga! ");
    }
    
    
    //metedos especias
    
    
}
