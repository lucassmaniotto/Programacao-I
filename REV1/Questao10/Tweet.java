package Questao10;

public class Tweet {
    private String autor;
    private String mensagem;
    protected int data;
    public String hash;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void retweet(){
        System.out.println(this.autor);
        System.out.println("RT " + this.mensagem);
        System.out.println(this.data);
        System.out.println(this.hash);
    }
}
