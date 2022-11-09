package Questao10;

public class Teste {
    public static void main(String[] args) {
        Tweet t = new Tweet();
        t.setAutor("Joao");
        t.setMensagem("Hello World");
        t.setData(2022);
        t.hash = "123456";
        t.retweet();
    }
}
