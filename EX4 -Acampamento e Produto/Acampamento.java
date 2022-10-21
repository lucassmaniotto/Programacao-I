public class Acampamento {
    private String nome;
    private int idade;
    private char equipe;

    Acampamento(String nome, int idade){
        this.nome = setNome(nome);
        this.idade = setIdade(idade);
    }

    public String setNome(String nome){
        return this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int setIdade(int idade){
        return this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setEquipe(char equipe){
        this.equipe = equipe;
    }

    public char getEquipe(){
        return equipe;
    }

    public void definirEquipe(){
        if(idade >= 6 && idade <= 10){
            setEquipe('A');
        }
        else if(idade >= 11 && idade <= 20){
            setEquipe('B');
        }
        else{
            setEquipe('C');
        }
    }

    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEquipe: " + getEquipe();
    }
}