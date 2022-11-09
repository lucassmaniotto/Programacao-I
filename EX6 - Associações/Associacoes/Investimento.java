package Associacoes;
public class Investimento extends Conta{
    protected double taxaRendimento;

    public Investimento(int numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void fazManutencao() {
        this.saldo += (this.saldo * this.taxaRendimento);
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData();
        movimentacao.setTipo('C');
        movimentacao.setValor(this.saldo * this.taxaRendimento);
        movimentacoes.add(movimentacao);
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Taxa de Rendimento: " + this.taxaRendimento);
    }
}
