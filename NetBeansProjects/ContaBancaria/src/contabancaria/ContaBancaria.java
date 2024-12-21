/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

/**
 *
 * @author fabri
 */
public class ContaBancaria {

   // Atributos da classe
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor para inicializar a conta bancária
    public ContaBancaria(String numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para realizar saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Método para obter informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo Atual: R$" + saldo);
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para alterar o nome do titular (opcional)
    public void setNomeTitular(String novoNome) {
        this.nomeTitular = novoNome;
        System.out.println("Nome do titular alterado para: " + novoNome);
    }

    // Método principal para teste
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("123456", "João Silva", 500.0);

        // Exibindo informações da conta
        conta.exibirInformacoes();

        // Realizando depósito
        conta.depositar(200.0);

        // Tentando sacar mais do que o saldo
        conta.sacar(800.0);

        // Realizando saque
        conta.sacar(300.0);

        // Exibindo informações após operações
        conta.exibirInformacoes();
    }
    
}
