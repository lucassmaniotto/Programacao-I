package Associacoes;
import java.util.Date;

public class Movimentacao {
    private Date data;
    private double valor;
    private char tipo;

    public Date getData() {
        return data;
    }

    public void setData() {
        this.data = new Date();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
