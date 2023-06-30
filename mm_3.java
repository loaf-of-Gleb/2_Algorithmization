//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import java.util.Scanner;
public class mm_3 {
    public static void task3() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество строк и столбцов матрицы:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println("введите k(строка) и p(столбец)");
        int k = scan.nextInt();
        int p = scan.nextInt();
        matrix = new int[m][n];
        System.out.println("заполните матрицу");
        for (int i = 0; i < m; i++) {
            System.out.println("строка - " + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }


        System.out.println("строка k: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == k - 1)
                    System.out.print(matrix[i][j] + "\t");
            }

        }

        System.out.println("\nстолбец p: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == p - 1)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

