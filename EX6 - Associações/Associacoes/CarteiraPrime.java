package Associacoes;
import java.util.ArrayList;

public class CarteiraPrime {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listar() {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Saldo: " + String.format("%.2f", cliente.getConta().getSaldo()));
            System.out.println("Número da conta: " + cliente.getConta().getNumero());
            System.out.println();
        }
    }
}
