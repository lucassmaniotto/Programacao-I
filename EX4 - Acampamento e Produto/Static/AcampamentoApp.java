package Static;
import java.util.Scanner;

public class AcampamentoApp {
    public static Acampamento[] acampantes = new Acampamento[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < acampantes.length; i++){
            System.out.print("Informe o nome do acampante: ");
            String nome = scanner.nextLine();
            System.out.print("Informe a idade do acampante: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpa a entrada de dados
            System.out.println();
            acampantes[i] = new Acampamento(nome, idade);
            acampantes[i].definirEquipe();
        }

        for(int i = 0; i < acampantes.length; i++){
            System.out.println(acampantes[i].toString());
            System.out.println();
        }

        scanner.close();
    }
}
