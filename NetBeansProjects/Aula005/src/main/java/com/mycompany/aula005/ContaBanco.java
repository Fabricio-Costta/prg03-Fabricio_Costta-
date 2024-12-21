package com.mycompany.aula005;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabri
 */
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String getDeposita;
    
    //metedos personalizados
    public void estadoAtual(){
        System.out.println("_______________________________________________________");
        System.out.println("Contas -> " + this.getNumConta());
        System.out.println("Tipo -> " + this.getTipo());
        System.out.println("Dono -> " + this.getDono());
        System.out.println("Saldo -> " + this.getSaldo());
        System.out.println("Status -> " + this.getStatus());
    }
    public void abriConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println(" Conta aberta co sucesso! ");
    }
    
    public void fechaConta(){
       if(getSaldo()>0){
           System.out.println(" A conta nao pode ser fechada pois ainda tem dinheiro na conta:");
       }else if(getSaldo() < 0){
           System.out.println(" A comta nao pode ser fechada pois ainda tem debitos");
       }else{
           this.setStatus(false);
           System.out.println(" Conta fechada co sucesso: ");
       }
    }
    
    public void deposita(float v){
        if(getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println(" Deposito realizado com sucesso na conta; " + this.getDeposita);
        }
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println(" Saldo realizado com sucesso: " + this.getSaldo());
            }else{
                System.out.println(" Saldo insuficiente pra saque:");
            }
        }else{
            System.out.println(" imposivel saque de uma conta fechada: ");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
                this.setSaldo(this.getSaldo() - v);
                System.out.println(" Mensalidade paga com sucesso: " + this.getDono());
        }else{
            System.out.println(" Inposivel paga com a conta fechada: ");
        }
    }
    
    // metedos especias
    
    public void ContaBanco(){
        saldo = 0;
        status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
}
