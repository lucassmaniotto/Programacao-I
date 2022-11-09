package Questao5;

public class Material {
    private int codigo;
    private String nome;
    private int quantidade;

    Material(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Material(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean retirada(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    public void abastecimento(int quantidade) {
        this.quantidade += quantidade;
    }

    public void exibir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
    }
   
}
