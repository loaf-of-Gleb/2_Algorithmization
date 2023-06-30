//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

import java.util.Scanner;

public class mm_1 {
    public static void task1() {
    int[][] matrix;
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов матрицы: ");
    int m = scan.nextInt();
    int n = scan.nextInt();
    matrix = new int[m][n];
        System.out.println("Заполните матрицу: ");
        for (int i = 0; i < m; i++) {
        System.out.println("строка - " + (i + 1) + " ");
        for (int j = 0; j < n; j++) {
            matrix[i][j] = scan.nextInt();
        }
    }
        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j += 2) {
            if (matrix[0][j] > matrix[m - 1][j]) {
                System.out.print(matrix[i][j] + "\t");
                 }
             }
        System.out.println();
        }
    }
}
