/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0021;

/**
 *
 * @author fabri
 */
public class Aula0021 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "bic";
        c1.ponta = 0.5f;
        c1.carga = 70;
        
        c1.tampar();
        c1.status();
        c1.rasbicar();
        System.out.println("");
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.modelo = " bic";
        c2.ponta = 1.0f;
        c2.carga = 55;
        
        c2.destampar();
        c2.status();
        c2.rasbicar();
        System.out.println("");
        
        Caneta c3 = new Caneta();
        c3.cor = " Vermelha";
        c3.modelo = " bic";
        c3.ponta = 0.5f;
        c3.carga = 15;
        
        c3.destampar();
        c3.status();
        c3.rasbicar();
        
        
    }
} 
