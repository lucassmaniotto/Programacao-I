import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Apolice apolice1 = new Apolice();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        apolice1.nomeSegurado = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        apolice1.idade = scanner.nextInt();
        System.out.print("Digite o valor do prêmio: ");
        apolice1.valorPremio = scanner.nextFloat();
        System.out.print("Digite sua cidade: ");
        String cidade = scanner.next();
        
        System.out.println();

        apolice1.calcularPremio();
        apolice1.imprimir();

        apolice1.oferecerDesconto(cidade);
        System.out.println("Valor do prêmio com desconto: " + apolice1.valorPremio);

        System.out.println();

        scanner.close();

        Apolice apolice2 = new Apolice("João", 20, 1000);

        apolice2.calcularPremio();
        apolice2.imprimir();

        apolice2.oferecerDesconto("Florianopolis");
        System.out.println("Valor do prêmio com desconto: " + apolice2.valorPremio);

        System.out.println();

        Apolice apolice3 = new Apolice("Maria", 30, 2000);

        apolice3.calcularPremio();
        apolice3.imprimir();

        apolice3.oferecerDesconto("Chapeco");
        System.out.println("Valor do prêmio com desconto: " + apolice3.valorPremio);

        System.out.println();

        Apolice apolice4 = new Apolice("José", 40, 3000);

        apolice4.calcularPremio();
        apolice4.imprimir();

        apolice4.oferecerDesconto("Joacaba");
        System.out.println("Valor do prêmio com desconto: " + apolice4.valorPremio);

        System.out.println();

        Apolice apolice5 = new Apolice("Ana", 50, 4000);

        apolice5.calcularPremio();
        apolice5.imprimir();

        apolice5.oferecerDesconto("Joinville");
        System.out.println("Valor do prêmio com desconto: " + apolice5.valorPremio);

        System.out.println();

        System.out.print("Quantidade de apólices: ");
        Apolice.exibeUltimoNum();
    }
}
