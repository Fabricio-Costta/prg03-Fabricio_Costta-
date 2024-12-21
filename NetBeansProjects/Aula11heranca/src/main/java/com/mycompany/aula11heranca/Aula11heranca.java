/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula11heranca;

/**
 *
 * @author fabri
 */
public class Aula11heranca {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome(" Joao");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        System.out.println("------------------");
        Aluno a1 = new Aluno();
        a1.setNome(" Leo");
        a1.setIdade(15);
        a1.setSexo("M");
        a1.setMatricula(0001);
        a1.setCurso(" Geografia");
        a1.pagamatricula();
        System.out.println(a1.toString());
        
        System.out.println("--------------------");
        Bolsista b1 = new Bolsista();
        b1.setNome(" Angela");
        b1.setIdade(22);
        b1.setSexo("F");
        System.out.println(b1.toString());
        b1.setMatricula(1234);
        b1.setCurso(" Informatica");
        b1.pagamatricula();
        
    }
}