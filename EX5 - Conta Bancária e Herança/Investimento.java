public class Investimento extends Conta{
    protected double taxaRendimento;

    public Investimento(int numero, double saldo, String nome, double taxaRendimento) {
        super(numero, saldo, nome);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void fazManutencao() {
        this.saldo += (this.saldo * this.taxaRendimento);
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Taxa de Rendimento: R$" + this.taxaRendimento);
        
    }
}
