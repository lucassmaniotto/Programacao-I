package Heranca;
public class Conta {
    protected int numero;
    protected double saldo;
    protected String nome;

    public Conta(int numero, double saldo, String nome) {
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public void resumoExtrato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: R$" + this.saldo);
    }

    public void fazManutencao(){
        return;
    }
}
