//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;
public class mm_6 {
    public static void task6() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядок кв. матрицы (четное число):");
        int n = scan.nextInt();
        matrix = new int[n][n];
        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
