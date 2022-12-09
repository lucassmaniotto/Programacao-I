package Static;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoApp {
    public static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public static void main(String[] args) {
        ProdutoApp app = new ProdutoApp();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        
        while(opcao != 9){

            app.menu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            
            if(opcao == 1){
                app.cadastrarProduto(scanner);
            }
            else if(opcao == 2){
                app.consultarEstoque(scanner);
            }
            else if(opcao == 3){
                app.removerUnidades(scanner);
            }
            else if(opcao == 4){
                app.adicionarUnidades(scanner);
            }
            else if(opcao == 9){
                System.out.println("Sistema finalizado");
            }
            else{
                System.out.println("Opção inválida!");
            }
        } 
        scanner.close();        
    }

    public void menu(){
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Consultar estoque");
        System.out.println("3 - Remover unidades");
        System.out.println("4 - Adicionar unidades");
        System.out.println("9 - Sair");
        System.out.print("Opção: ");
    }

    public boolean ehNegativoInt(int valor){
        if(valor < 0){
            return true;
        }
        return false;
    }

    public boolean ehNegativoDouble(double valor){
        if(valor < 0){
            return true;
        }
        return false;
    }

    public void cadastrarProduto(Scanner scanner){
        Produto produto = new Produto();

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();
        if(!produtos.isEmpty()){
            for(Produto p : produtos){
                if(p.getNome().equals(nome)){
                    System.out.println("Produto já cadastrado!");
                    System.out.println();
                    return;
                }
            }
        }
        produto.setNome(nome);
        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        if(!ehNegativoDouble(preco)){
            produto.setPreco(preco);
            System.out.print("Informe a quantidade do produto: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            if(!ehNegativoInt(quantidade)){
                produto.setQuantidade(quantidade);
                produtos.add(produto);
                System.out.println("Produto cadastrado com sucesso!");
            }
            else{
                System.out.println("Quantidade inválida!");
            }
            System.out.println();
        }
        else{
            System.out.println("Preço inválido!");
            System.out.println();
        }
    }

    public String consultarEstoque(Scanner scanner){
        if(!produtos.isEmpty()){
            System.out.print("Informe o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.println();

            for(int i = 0; i < produtos.size(); i++){
                if(produtos.get(i).getNome().equals(nome)){
                    System.out.println(produtos.get(i).toString());
                    System.out.println();
                    return produtos.get(i).getNome();
                }
            }
            for(Produto p : produtos){
                if(!p.getNome().equals(nome)){
                    System.out.println("Produto não cadastrado!");
                    System.out.println();
                }
            }
        }
        else{
            System.out.println("Não há produtos cadastrados!");
            System.out.println();
        }
        return null;
    }

    public void removerUnidades(Scanner scanner){
        String nome = consultarEstoque(scanner);

        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getNome().equals(nome)){
                System.out.println("Quantas unidades deseja remover?");
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                if(ehNegativoInt(quantidade)){
                    System.out.println("Quantidade inválida!");
                    System.out.println();
                    return;
                }

                if(produtos.get(i).removerUnidades(quantidade)){
                    System.out.print("Quantidade atual: ");
                    System.out.println(produtos.get(i).getQuantidade());
                    System.out.println();
                }
            }
        }
    }

    public void adicionarUnidades(Scanner scanner){
        String nome = consultarEstoque(scanner);

        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getNome().equals(nome)){
                System.out.println("Quantas unidades deseja adicionar?");
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                if(ehNegativoInt(quantidade)){
                    System.out.println("Quantidade inválida");
                    System.out.println();
                    return;
                }
                else{
                    produtos.get(i).adicionarUnidades(quantidade);
                    System.out.print("Quantidade atual: ");
                    System.out.println(produtos.get(i).getQuantidade());
                    System.out.println();
                }
            }
        }
    }
}