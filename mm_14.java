//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру
// столбца

import java.util.Scanner;
public class mm_14 {
    public static void task14() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов матрицы:");
        int n = scan.nextInt();
        int m = scan.nextInt();
        matrix = new int[m][n];
        System.out.println("Результат:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
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
//m и n должны быть случайными?