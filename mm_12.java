//Отсортировать строки матрицы по возрастанию и убыванию значений элементов

import java.util.Scanner;
public class mm_12 {
    public static void task12() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов матрицы:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        matrix = new int[m][n];
        for (
                int i = 0; i < m; i++) {
            System.out.println("строка - " + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("По возрастанию: ");
        for (int i = 0; i < m; i++) {
            int swap;
            boolean canSort = false;
            while (!canSort) {
                canSort = true;
                for (int j = 0; j < n - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        canSort = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = swap;
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
        System.out.println("По убыванию: ");
        for (int i = 0; i < m; i++) {
            int swap;
            boolean canSort = false;
            while (!canSort) {
                canSort = true;
                for (int j = 0; j < n - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        canSort = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = swap;
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
