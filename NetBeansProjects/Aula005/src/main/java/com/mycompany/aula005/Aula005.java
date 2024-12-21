/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula005;

/**
 *
 * @author fabri
 */
public class Aula005 {

    public static void main(String[] args) {
        System.out.println(" Hellor word!");
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta( 1111);
        c1.setDono(" Nakamura" );
        c1.estadoAtual( );
        c1.abriConta(" CP");
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(0002);
        c2.setDono("salto");
        c2.estadoAtual();
        c2.abriConta(" CP");
        
        c1.deposita(2000);
        c2.deposita(5500);
        c2.sacar(1350);
        
        c1.estadoAtual();
        c2.estadoAtual();
    }

    
}
