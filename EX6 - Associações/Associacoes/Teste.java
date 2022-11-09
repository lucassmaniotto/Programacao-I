package Associacoes;
public class Teste {
    public static void main(String[] args) {
        // Instanciando um cliente e uma conta especial
        Cliente michael = new Cliente();
        michael.setNome("Michael Scott");
        michael.setCpf("123.456.789-00");
        ContaEspecial contaEspecial = new ContaEspecial(001, 1000, 500, 10);
        contaEspecial.setCliente(michael);
        michael.setConta(contaEspecial);
     
        // Instanciando um cliente e uma conta investimento
        Cliente dwight = new Cliente();
        dwight.setNome("Dwight Schrute");
        dwight.setCpf("987.654.321-00");
        Investimento contaInvestimento = new Investimento(002, 1113, 0.15);
        contaInvestimento.setCliente(dwight);
        dwight.setConta(contaInvestimento);

        System.out.println("--------------------------------------------------");

        // TESTE CONTA ESPECIAL
        System.out.println("Teste de conta especial:");
        contaEspecial.resumoExtrato();

        System.out.println("\nSaque de R$ 500,00 na conta de " + contaEspecial.getCliente().getNome());
        contaEspecial.sacar(500);
        contaEspecial.resumoExtrato();

        System.out.println("\nSaque de R$ 700,00 na conta de " + contaEspecial.getCliente().getNome());
        contaEspecial.sacar(700);
        contaEspecial.resumoExtrato();

        System.out.println("\nSaque de R$ 600,00 na conta de " + contaEspecial.getCliente().getNome());
        contaEspecial.sacar(600);
        contaEspecial.resumoExtrato();

        System.out.println("\nDepósito de R$ 250,31 na conta de " + contaEspecial.getCliente().getNome());
        contaEspecial.depositar(250.31);
        contaEspecial.resumoExtrato();

        System.out.println("\nManutenção na conta de " + contaEspecial.getCliente().getNome());
        contaEspecial.fazManutencao();
        contaEspecial.resumoExtrato();

        System.out.println();

        contaEspecial.extrato();

        System.out.println("--------------------------------------------------");

        // TESTE CONTA INVESTIMENTO
        System.out.println("\nTeste de conta investimento:");
        contaInvestimento.resumoExtrato();

        System.out.println("\nSaque de R$ 500,50 na conta de " + contaInvestimento.getCliente().getNome());
        contaInvestimento.sacar(500.50);
        contaInvestimento.resumoExtrato();

        System.out.println("\nDepósito de R$ 250,33 na conta de " + contaInvestimento.getCliente().getNome());
        contaInvestimento.depositar(250.33);
        contaInvestimento.resumoExtrato();

        System.out.println("\nSaque de R$ 1000,00 na conta de " + contaInvestimento.getCliente().getNome());
        contaInvestimento.sacar(1000);
        contaInvestimento.resumoExtrato();

        System.out.println("\nManutenção na conta de " + contaInvestimento.getCliente().getNome());
        contaInvestimento.fazManutencao();
        contaInvestimento.resumoExtrato();

        System.out.println();

        contaInvestimento.extrato();

        System.out.println("--------------------------------------------------");

        // ADICIONANDO A CARTEIRA PRIME
        CarteiraPrime clientesPrime = new CarteiraPrime();
        clientesPrime.adicionar(michael);
        clientesPrime.adicionar(dwight);
        clientesPrime.listar();

        System.out.println("--------------------------------------------------");
       
    }
}
