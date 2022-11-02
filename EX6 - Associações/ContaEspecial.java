public class ContaEspecial extends Conta{
    protected double limite;
    protected double taxaManutencao;

    public ContaEspecial(int numero, double saldo, double limite, double taxaManutencao) {
        super(numero, saldo);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            Movimentacao movimentacao = new Movimentacao();
            movimentacao.setData();
            if(this.saldo < 0) {
                movimentacao.setTipo('C');
            } 
            else {
                movimentacao.setTipo('D');
            }
            movimentacao.setValor(valor);
            movimentacoes.add(movimentacao);
            return true;
        }
        System.out.println("Saldo e limite insuficiente");
        return false;
    }

    @Override
    public void fazManutencao() {
        this.saldo -= this.taxaManutencao;
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData();
        movimentacao.setTipo('D');
        movimentacao.setValor(this.taxaManutencao);
        movimentacoes.add(movimentacao);
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Limite: R$" + this.limite);
    }
}