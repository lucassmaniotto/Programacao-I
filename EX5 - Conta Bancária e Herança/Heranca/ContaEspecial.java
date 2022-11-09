package Heranca;
public class ContaEspecial extends Conta{
    protected double limite;
    protected double taxaManutencao;

    public ContaEspecial(int numero, double saldo, String nome, double limite, double taxaManutencao) {
        super(numero, saldo, nome);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Saldo e limite insuficiente");
        return false;
    }

    @Override
    public void fazManutencao() {
        this.saldo -= this.taxaManutencao;
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Limite: R$" + this.limite);
    }
    
}
