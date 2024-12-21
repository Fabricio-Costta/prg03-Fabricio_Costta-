/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0021;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.print(" Uma caneta " + this.cor);
        System.out.println(" Esta tampada? " + this.tampada);
        System.out.println(" O modelo da caneta e: " + this.modelo);
        System.out.println(" A carga da caneta e " + this.carga);
        System.out.println(" A ponta da caneta e " + this.ponta);
    }
    
    void rasbicar(){
        if(this.tampada == true){
            System.out.println(" ERRO! nao posso rabiscar ");
        }else{
            System.out.println(" Estou rabiscando");
        }
    }
     
    void tampar(){
        this.tampada = true;
        
    }
    
    void destampar(){
        this.tampada = false;
    }

 
}
