//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;
public class mm_5 {
    public static void task5() {
    int[][] matrix;
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядок кв. матрицы (четное число):");
    int n = scan.nextInt();
    matrix = new int[n][n];
        if (n % 2 == 0) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    if (n - (i + j) <= 0) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] = i + 1;
                    }
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
}

