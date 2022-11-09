package Basic;
public class Exercicio6 {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 15) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        } 
    }
}