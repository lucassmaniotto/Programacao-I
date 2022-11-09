package Basic;
public class Exercicio7 {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}