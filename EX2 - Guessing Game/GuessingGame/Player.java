package GuessingGame;
public class Player{
    public int number;

    public void guess() {
        this.number = (int) (Math.random() * 10);
        System.out.println("Estou pensando em " + number);
    }
}