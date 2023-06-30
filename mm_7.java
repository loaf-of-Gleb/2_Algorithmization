//Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней

import java.util.Scanner;
public class mm_7 {
    public static void task7() {
        int count = 0;
        double[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядок кв. матрицы (четное число):");
        int n = scan.nextInt();
        matrix = new double[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((double) (i * i - j * j) / n);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println("кол-во положительных элементов - " + count);
    }
}
