//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

import java.util.Scanner;
public class mm_15 {
    public static void task15() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов матрицы:");
        int n = scan.nextInt();
        int m = scan.nextInt();
        matrix = new int[m][n];
        int max = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
