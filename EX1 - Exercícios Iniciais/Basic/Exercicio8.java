package Basic;
public class Exercicio8 {
    public static void main(String[] args) {
        int[] numbers = new int[] {5, 78, 37, 100, 8, 2, 42, 13, 9, 10};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Menor valor: " + min);
        System.out.println("Maior valor: " + max);

    }
}
