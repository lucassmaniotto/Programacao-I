package Basic;
public class Exercicio9 {
    // função de média
    public static double average(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int[] numbersUnderAverage = new int[50];

        // gerar números aleatórios e preenche array
        for (int i = 0; i < 50; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        //print array total
        System.out.println("Valores gerados:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println("Média do array: " + average(numbers));
        System.out.println();

        //print array abaixo da média
        System.out.println("Valores menores que a média:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average(numbers)) {
                System.out.print(numbers[i]+ " ");
                for (int j = 0; j < numbersUnderAverage.length; j++) {
                    numbersUnderAverage[i] = numbers[i];
                }
            }
        }
        System.out.println();
        System.out.println("Média dos valores menores que a média: " + average(numbersUnderAverage));
        
    }
}