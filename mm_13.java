//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

import java.util.Scanner;
public class mm_13 {
    public static void task13() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов матрицы:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("строка - " + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        System.out.println("по возрастанию:");
        for (int j = 0; j < n; j++) {
            int swap;
            boolean canSort = false;
            while (!canSort) {
                canSort = true;
                for (int i = 0; i < m - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        canSort = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = swap;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("по убыванию:");
        for (int j = 0; j < n; j++) {
            int swap;
            boolean canSort = false;
            while (!canSort) {
                canSort = true;
                for (int i = 0; i < m - 1; i++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        canSort = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = swap;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
// надо починить отрицательные числа, вернусь потом