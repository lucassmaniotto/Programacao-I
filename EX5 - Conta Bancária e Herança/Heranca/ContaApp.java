package Heranca;
public class ContaApp {
    public static void main(String[] args) {
        Conta conta = new Conta(1, 1000, "David");
        ContaEspecial contaEspecial = new ContaEspecial(2, 1000, "Lucy", 1000, 10);
        Investimento contaInvestimento = new Investimento(3, 1000, "Rebecca", 0.5);

        System.out.println("Teste de Conta");
        conta.resumoExtrato();
        System.out.println();
        System.out.println("Depositando R$100,00 na Conta do David");
        conta.depositar(100);
        conta.resumoExtrato();
        System.out.println();
        System.out.println("Sacando R$950,00 da Conta do David");
        conta.sacar(950);
        conta.resumoExtrato();
        System.out.println();
        System.out.println("Sacando R$200,00 da Conta do David");
        conta.sacar(200);
        conta.resumoExtrato();

        System.out.println();

        System.out.println("Teste de Conta Especial");
        contaEspecial.resumoExtrato();
        System.out.println();
        System.out.println("Depositando R$100,00 na Conta Especial da Lucy");
        contaEspecial.depositar(100);
        contaEspecial.resumoExtrato();
        System.out.println();
        System.out.println("Sacando R$950,00 da Conta Especial da Lucy");
        contaEspecial.sacar(950);
        contaEspecial.resumoExtrato();
        System.out.println();
        System.out.println("Sacando R$1150,00 da Conta Especial da Lucy");
        contaEspecial.sacar(1150);
        contaEspecial.resumoExtrato();
        System.out.println();
        System.out.println("Sacando R$200,00 da Conta Especial da Lucy");
        contaEspecial.sacar(200);
        contaEspecial.resumoExtrato();
        System.out.println();
        System.out.println("Depositando R$1000,00 na Conta Especial da Lucy");
        contaEspecial.depositar(1000);
        contaEspecial.resumoExtrato();
        System.out.println();
        System.out.println("Fazendo manutenção na Conta Especial da Lucy");
        contaEspecial.fazManutencao();
        contaEspecial.resumoExtrato();

        System.out.println();

        System.out.println("Teste de Investimento");
        contaInvestimento.resumoExtrato();
        System.out.println();
        System.out.println("Depositando R$100,00 na Conta de Investimento da Rebecca");
        contaInvestimento.depositar(100);
        contaInvestimento.resumoExtrato();
        System.out.println();
        System.out.println("Sacando R$950,00 da Conta de Investimento da Rebecca");
        contaInvestimento.sacar(950);
        contaInvestimento.resumoExtrato();
        System.out.println();
        System.out.println("Sacando R$200,00 da Conta de Investimento da Rebecca");
        contaInvestimento.sacar(200);
        contaInvestimento.resumoExtrato();
        System.out.println();
        System.out.println("Rendendo o dinheiro da Conta de Investimento da Rebecca");
        contaInvestimento.fazManutencao();
        contaInvestimento.resumoExtrato();

    }
}
