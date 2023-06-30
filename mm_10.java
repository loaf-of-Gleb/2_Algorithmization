//Найти положительные элементы главной диагонали квадратной матрицы

import java.util.Scanner;
public class mm_10 {
    public static void task10() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("кол-во строк/столбцов кв. матрицы:");
        int n = scan.nextInt();
        matrix = new int[n][n];
        System.out.println("заполните матрицу:");
        for (int i = 0; i < n; i++) {
            System.out.println("строка - " + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("положительные элементы главной диагонали: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}
