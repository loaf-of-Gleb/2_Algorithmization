//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

import java.util.Scanner;
public class mm_2 {
    public static void task2() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество строк/столбцов квадратной матрицы:");
        int n = scan.nextInt();
        matrix = new int[n][n];
        System.out.println("заполните матрицу");
        for (int i = 0; i < n; i++) {
            System.out.println("строка - " + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Элементы главной диагонали:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }

        }

        System.out.println("Элементы побочной диагонали:");
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
    }
}
