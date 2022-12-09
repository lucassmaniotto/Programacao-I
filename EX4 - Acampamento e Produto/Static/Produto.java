package Static;
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public boolean verificarDisponibilidade(int quantidade){
        if(this.quantidade >= quantidade){
            return true;
        }
        else{
            return false;
        }
    }

    public void adicionarUnidades(int quantidade){
        this.quantidade += quantidade;
    }

    public boolean removerUnidades(int quantidade){
        if(verificarDisponibilidade(quantidade)){
            this.quantidade -= quantidade;
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nQuantidade: " + getQuantidade();
    }
}