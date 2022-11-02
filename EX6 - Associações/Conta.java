import java.util.ArrayList;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(ArrayList<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData();
        movimentacao.setTipo('D');
        movimentacao.setValor(valor);
        movimentacoes.add(movimentacao);
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            Movimentacao movimentacao = new Movimentacao();
            movimentacao.setData();
            movimentacao.setTipo('D');
            movimentacao.setValor(valor);
            movimentacoes.add(movimentacao);
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public void resumoExtrato(){
        System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
    }

    public abstract void fazManutencao();
    
    public void extrato(){
        System.out.println("Movimentações de " + this.cliente.getNome() + ":");
        for (Movimentacao movimentacao : movimentacoes) {
            System.out.println("Data: " + movimentacao.getData());
            System.out.println("Tipo: " + movimentacao.getTipo());
            System.out.println("Valor: " + String.format("%.2f", movimentacao.getValor()));
            System.out.println();
        }
    }
}
