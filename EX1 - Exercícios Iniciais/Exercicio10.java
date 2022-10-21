public class Exercicio10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {  // coluna
            for (int j = 0; j < matrix[i].length; j++) { // linha
                matrix[i][j] = i + j;
                if (i > j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Soma dos elementos abaixo da diagonal principal: " + sum);
    }
    
}
