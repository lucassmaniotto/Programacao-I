public class Apolice {
    public int numApolice;
    public String nomeSegurado;
    public int idade;
    public float valorPremio;
    public static int ultimoNumApolice = 0;

    Apolice(){
        Apolice.ultimoNumApolice++;
        this.numApolice = ultimoNumApolice;
    }

    Apolice(String nomeSegurado, int idade, float valorPremio){
        Apolice.ultimoNumApolice += 1;
        this.numApolice = ultimoNumApolice;
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public void imprimir(){
        System.out.println("Número do Apolice: " + this.numApolice);
        System.out.println("Nome: " + this.nomeSegurado);
        System.out.println("Idade: " + this.idade);
        System.out.println("Valor do Prêmio: " + this.valorPremio);
    }

    public void calcularPremio(){
        if(this.idade >= 18 && this.idade <= 25){
            this.valorPremio += valorPremio * 0.2;
        }
        else if(this.idade > 25 && this.idade <= 36){
            this.valorPremio += valorPremio * 0.15;
        }
        else if(this.idade > 36){
            this.valorPremio += valorPremio * 0.1;
        }
    }

    public float oferecerDesconto(String city){
        if(city.equals("Florianopolis")){
            return this.valorPremio -= valorPremio * 0.05;
        }
        else if(city.equals("Chapeco")){
            return this.valorPremio -= valorPremio * 0.06;
        }
        else if(city.equals("Joacaba")){
            return this.valorPremio -= valorPremio * 0.07;
        }
        else if(city.equals("Joinville")){
            return this.valorPremio -= valorPremio * 0.08;
        }
        else{
            return this.valorPremio;
        }
    }

    public static void exibeUltimoNum(){
        System.out.println(Apolice.ultimoNumApolice);
    }
}

