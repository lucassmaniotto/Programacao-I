public class GuessGame {
    public Player p1;
    public Player p2;
    public Player p3;

    public void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int target = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um número entre 0 e 9 ...");

        while(true){
            System.out.println("O número a adivinhar é " + target);

            p1.guess();
            p2.guess();
            p3.guess();

            p1Guess = p1.number;
            p2Guess = p2.number;
            p3Guess = p3.number;

            System.out.println("O jogador forneceu o palpite " + p1Guess);
            System.out.println("O jogador forneceu o palpite " + p2Guess);
            System.out.println("O jogador forneceu o palpite " + p3Guess);

            if (p1Guess == target) {
                p1IsRight = true;
            }
            else if (p2Guess == target) {
                p2IsRight = true;
            }
            else if (p3Guess == target) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight){
                System.out.println("Temos um vencedor!");
                System.out.println("O jogador um acertou? " + p1IsRight);
                System.out.println("O jogador um acertou? " + p2IsRight);
                System.out.println("O jogador um acertou? " + p3IsRight);

                System.out.println("Fim de Jogo");
                break;
            }
            else{
                System.out.println("Os jogadores terão que tentar novamente.");
            }
        }
    }
}